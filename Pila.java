/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase que implementa 
 */

import java.util.*;

public class Pila<T> {
    
    T Movimiento; 
    private int posicion;
    Vector miPila;
    
    //metodo constructor
    public Pila( ){
        posicion=0;
        miPila= new Vector(10,5);
     
    }
    
    //metodo push que ingresa elementos al vector
    public void push (T Movimieto){
        miPila.addElement(Movimiento);
        posicion++;
    }
    
    //metodo po que obtine el elemento actual y resta al contador posicion
    public T pop (){
        T elemento=  (T) miPila.elementAt(posicion-1);
        miPila.removeElementAt(posicion-1);
        posicion--;
        return elemento;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public Vector getVector(){
        return miPila;
    }
    
}

