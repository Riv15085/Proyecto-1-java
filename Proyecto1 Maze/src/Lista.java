/**
 *
 * Jorge Tezen 15417
 * @param <T>
 */

import java.util.*;

public class Lista {

    Nodo Cabeza;
    int Largo=0;
    
    public int size() {
        return Largo;
    }

    
    public boolean isEmpty() {
        return  Largo==0;
    }
	
	
    public void addNodo(int valor){
        if (Cabeza == null){
            Cabeza = new Nodo(valor);
        }
        else{
            Nodo nodoActual = Cabeza;
            while (nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente( new Nodo(valor));
        }
    }
	
    public Nodo getNodo(){
        Nodo nodoActual = Cabeza;
        Cabeza = Cabeza.getSiguiente();
        return nodoActual;
    }
    
    public void Print(){
        Nodo nodo=Cabeza;
        while(nodo!=null){
               System.out.println(nodo.Valor);
               nodo=nodo.Siguiente;
        }
    }
}