/**
 *
 * Jorge Mario Tezen 
 * @param <T>
 */
public class Nodo<T extends Comparable>{
    
    T Valor;
    
    Pila MiPila= new Pila();
    
    Nodo Siguiente;
    Nodo Anterior;
    
    
    public Nodo(T valor)
    {
         this.Valor = valor;
       
    }
    
    public void setValor(T valor)
    {
        MiPila.push(valor);
    }
    
    public T getValor()
    {
        return (T) MiPila.pop();
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
        return  Valor.toString();
    }
    
    public int compareTo(T other){
        //regresa un valor entero dependiendo de la comparacion
        //regresa 1 si el objeto comparado es mayor, 0 si es igual y -1 si es menor
        return Valor.compareTo(other);    
    }
    

}