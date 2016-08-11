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
Nodo.java
*/

/**
 *
 * @author JuanPablo
 */
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
        //Al crear el nodo se le indica cual sera su movimiento
        //Dependiendo del movimiento se baja la bandera del camino que tomo 
        MiDecision = new Decision();
        movimiento= MiDecision.decidir(decision);
        switch (decision){
            case "xxx":
                Derecha = false;
                Recto = false;
                Izquierda = false;   
                break;
            case "xxo":
                Derecha= false;
                Recto = false;
                Izquierda = false;
                break;

            case "xoo":
                Derecha = false;
                Recto = true;
                Izquierda = false;
                break;

            case "oxx":
                Derecha = false;
                Recto = false;
                Izquierda = false;
                break;

            case "oxo":
                Derecha= false;
                Recto = false;
                Izquierda = true;
                break;

            case "oox":
                Derecha = false;
                Recto = false;
                Izquierda = true;
                break;

            case "ooo":
                Derecha = false;
                Recto = true;
                Izquierda = true;
                break;

            case "xox":
                Derecha = false;
                Recto = false;
                Izquierda = false;
                break;
            default:
                Derecha = true;
                Recto = true;
                Izquierda = true;
                break;
        }
        
    }
      
      
    public void setMovimiento(String movimiento)
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
