public class Main{
	//returns a Decision based on the state of the sensor
	public static void main(String[] args){
        Nodo nodoCola = new Nodo("xox");
        Motor motor = new Motor();

        Sensor sensor = new Sensor();
        while(sensor.getContador()>2){
        String deteccion = sensor.Detectar();
        Decision miDecision = new Decision();
        
            while (!deteccion.equalsIgnoreCase("ooo") ) {
                nodoCola.setSiguiente( new Nodo(deteccion));
                nodoCola = nodoCola.getSiguiente();
                //mover motor a donde decidimos
                motor.mover(nodoCola.getMovimiento());

            if (nodoCola.getMovimiento().equalsIgnoreCase("Stop")){
              while (nodoCola.getAnterior().isDerecha()==false && nodoCola.getAnterior().isRecto()==false && nodoCola.getAnterior().isIzquierda()==false){
                  nodoCola = nodoCola.getAnterior();
                  //mover motor contrario a lo que tiene....
                  motor.moverN(nodoCola.getMovimiento());
              }
              if (nodoCola.isDerecha()){
                  deteccion = "O".concat(deteccion.substring(1, 2));
              }
              else{
                  deteccion = "X".concat(deteccion.substring(1, 2));
              }
              if (nodoCola.isRecto()){
                  deteccion = deteccion.substring(0, 0) + "O".concat(deteccion.substring(1, 2));
              }
              else{
                  deteccion = deteccion.substring(0, 0) + "X".concat(deteccion.substring(1, 2));
              }
              if (nodoCola.isIzquierda()){
                  deteccion = deteccion.substring(0, 1) + "O";
              }
              else{
                  deteccion = deteccion.substring(0, 1) + "X";
              }
              nodoCola.setMovimiento(miDecision.decidir(deteccion));
                switch (nodoCola.getMovimiento()){
                    case ("Seguir Recto"):
                    nodoCola.setRecto(false); 
                    motor.mover(nodoCola.getMovimiento());
                    break;
                    /// mover motor
                    case ("Girar Derecha"):
                    nodoCola.setDerecha(false); 
                    motor.mover(nodoCola.getMovimiento());
                    break;
                    case ("Girar Izquierda"):
                    nodoCola.setIzquierda(false); 
                    motor.mover(nodoCola.getMovimiento());
                    break;
                }
            }
            //volver a sensar
            deteccion = sensor.Detectar();
            }
        }
    }
}

