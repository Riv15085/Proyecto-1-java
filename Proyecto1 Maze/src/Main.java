/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Universidad del Valle de Guatemala
Proyecto1 AED
Juan Pablo Cahueque
Enma Lopez
Diego Rivera
Jorge Tezen
Main.java
*/

public class Main{
	//returns a Decision based on the state of the sensor
	public static void main(String[] args){
        //Se inicia un nodo base
        Nodo nodoCola = new Nodo("xox");
        Nodo nodoAnterior;
        //se instancia un motor, una clase decision y el sensor
        Motor motor = new Motor();
        Sensor sensor = new Sensor();
        Decision miDecision = new Decision();
        //while(sensor.getContador()>1){
            //Se detecta un estado incial
            String deteccion = sensor.Detectar();
            //Mientras encuentre una pared, y existan mas detecciones
            while (!deteccion.equalsIgnoreCase("ooo")&&sensor.getContador()>0 ) {
                //Instanciar el siguiente nodo
                nodoCola.setSiguiente( new Nodo(deteccion));
                //Pasar el nodo actual al nodo anterior
                nodoAnterior = nodoCola;
                //Convertirse en el ultimo nodo
                nodoCola = nodoCola.getSiguiente();
                //Actucalizar el nodo anterior
                nodoCola.setAnterior(nodoAnterior);
                //mover motor a donde decidimos
                motor.mover(nodoCola.getMovimiento()+"!");
                //Si se le indico al motor parar regresar al ultimo cruce
                if (nodoCola.getMovimiento().equalsIgnoreCase("STOP")){
                    System.out.println("Se regresara al ultimo cruce");
                    //Se sabe que el ultimo cruce existe en donde todavia quedan opciones
                    do{
                        //Se toma como nodo cola el nodo con el ultimo cruce, olvidandose de los que constituyen el camino infructuoso
                        nodoCola = nodoCola.getAnterior();
                        //mover motor contrario a lo que tiene....
                        motor.moverN(nodoCola.getMovimiento());
                    }while (nodoCola.getAnterior().isDerecha()==false && nodoCola.getAnterior().isRecto()==false && nodoCola.getAnterior().isIzquierda()==false);
                    nodoCola = nodoCola.getAnterior();
                    motor.moverN(nodoCola.getMovimiento());
                    //Se actualiza la nueva deteccion del ultimo cruce
                    if (nodoCola.isIzquierda()){
                        deteccion = "o".concat(deteccion.substring(1, 3));
                    }
                    else{
                        deteccion = "x".concat(deteccion.substring(1, 3));
                    }
                    if (nodoCola.isRecto()){
                        deteccion = deteccion.substring(0, 1) + "o".concat(deteccion.substring(1, 3));
                    }
                    else{
                        deteccion = deteccion.substring(0, 1) + "x".concat(deteccion.substring(1, 3));
                    }
                    if (nodoCola.isDerecha()){
                        deteccion = deteccion.substring(0, 2) + "o";
                    }
                    else{
                        deteccion = deteccion.substring(0, 2) + "x";
                    }
                    System.out.println("Ahora se tomara otro camino, eliminando el anterior ");
                    //Se le indica al nodo su nueva decision
                    nodoCola.setMovimiento(miDecision.decidir(deteccion));
                    switch (nodoCola.getMovimiento()){
                        case ("Seguir Recto"):
                        nodoCola.setRecto(false); 
                        break;
                        /// mover motor
                        case ("Girar Derecha y avanzar"):
                        nodoCola.setDerecha(false); 
                        break;
                        case ("Girar Izquierda y avanzar"):
                        nodoCola.setIzquierda(false); 
                        break;
                    }
                    motor.mover(nodoCola.getMovimiento());
                }
                //volver a detectar
                if (sensor.getContador()>0){
                    deteccion = sensor.Detectar();
                }
            }
            System.out.println("Se llego al final del laberinto");
        //}
    }
}


