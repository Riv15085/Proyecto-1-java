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
Motor.java
*/

/**
 *
 * @author JuanPablo
 */
public class Motor {
    
    boolean motorOn;
    //En la simulacion se imprime lo que haria el robot en la vida real
    public Motor(){
        motorOn = true;
    }
    
    public void Avanzar(int tiempo){
        while (tiempo>0){
        motorOn=true;
        for (int i=0; i<0; i++){
            tiempo--;
        }
        
        }  
    }
    
    public void mover(String movimiento){
        System.out.println(movimiento);
    }
    
    public void moverN(String movimiento){
        //Realiza el inverso de lo que habia echo anteriormente para regresar a un estado especifico
        switch(movimiento){
            case ("Seguir Recto"):
                System.out.println("Mover atras 1");
                break;
            case ("Girar Derecha y avanzar"):
                System.out.println("Retoceder y girar Izquierda");
                break;
            case ("Girar Izquierda y avanzar"):
                System.out.println("Retroceder y girar Derecha");
                break;
        }
    }
}
