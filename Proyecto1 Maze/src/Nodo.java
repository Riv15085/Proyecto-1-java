/**
 *
 * Jorge Mario Tezen 
 * @param
 */
public class Nodo{
    
    private boolean Derecha= true;
    private boolean Izquierda= true;
    private boolean Recto=true;
    private String movimiento = "";
    private Decision MiDecision;


    
    //Pila MiPila= new Pila();
    
    Nodo Siguiente;
    Nodo Anterior;
    
    
    public Nodo(String decision)
    {
      MiDecision = new Decision();
      movimiento= MiDecision.decidir(decision);
      switch (decision){
	case "xxx":
            Derecha = false;
            Recto = false;
            Izquierda = false;    
        case "xxo":
            Derecha= false;
            Recto = false;
            Izquierda = true;
                            
	case "xoo":
            Derecha = false;
            Recto = true;
            Izquierda = true;
                            	
	case "oxx":
            Derecha = true;
            Recto = true;
            Izquierda = true;
                         
	case "oxo":
            Derecha= true;
            Recto = false;
            Izquierda = true;
				
        case "oox":
                Derecha = true;
                Recto = true;
                Izquierda = false;
            
        case "ooo":
                Derecha = true;
                Recto = true;
                Izquierda = true;
                                
        case "xox":
                Derecha = true;
                Recto = true;
                Izquierda = true;
                             
        default:
                Derecha = true;
                Recto = true;
                Izquierda = true;
                            
	}
               
	
      switch (movimiento){
          case "Seguir Recto":
              this.Recto = false; 
          case "STOP":
              this.Recto = false; 
              this.Izquierda = false; 
              this.Derecha = false;
          case ("Girar Derecha"):
              this.Derecha = false;
          case ("Girar Izquierda"):
              this.Izquierda = false;
          default:
              System.out.println(movimiento);
      }
    }
      
      
    public void setMovimiento(String valor)
    {
        this.movimiento=movimiento;
    }
    
    public String getMovimiento()
    {
        return movimiento;
    }    
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    public void setAnterior(Nodo anterior){
        this.Anterior = anterior;
    }
    
    public Nodo getAnterior(){
        return this.Anterior;
    }
    
    public String toString(){
        return  movimiento;
    }
    public Decision getMiDecision() {
        return MiDecision;
    }
    
   /* public int compareTo(T other){
        //regresa un valor entero dependiendo de la comparacion
        //regresa 1 si el objeto comparado es mayor, 0 si es igual y -1 si es menor
        return Valor.compareTo(other);    
    }*/

    public boolean isDerecha() {
        return Derecha;
    }

    public boolean isIzquierda() {
        return Izquierda;
    }

    public boolean isRecto() {
        return Recto;
    }

    public void setDerecha(boolean Derecha) {
        this.Derecha = Derecha;
    }

    public void setIzquierda(boolean Izquierda) {
        this.Izquierda = Izquierda;
    }

    public void setRecto(boolean Recto) {
        this.Recto = Recto;
    }
    

}