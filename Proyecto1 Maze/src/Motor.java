
/**
 *
 * @author Usuario
 */
public class Motor {
    
    boolean motorOn;
    
    public Motor(){
        
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
        switch(movimiento){
            case ("Seguir Recto"):
                System.out.println("Mover atras 1");
                break;
            case ("Girar Derecha"):
                System.out.println("Girar Izquierda");
                break;
            case ("Girar Izquierda"):
                System.out.println("Girar Derecha");
                break;
        }
    }
}