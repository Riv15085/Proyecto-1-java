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
Decision.java
*/
//En la simulacion esta clase se encarga de tomar una decision en base al estado de los sensores en cada nodo
public class Decision {
        private boolean right;
        private boolean left;
	private boolean front;
        private String mensaje;

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setFront(boolean front) {
        this.front = front;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isFront() {
        return front;
    }

    public String getMensaje() {
        return mensaje;
    }
	

    public Decision(){
        right = false;
        left = false;
        front = false;

    }

    public String decidir(String decision){
        mensaje = "";
        switch (decision){
            case "xxx":
                mensaje = "STOP";
                return mensaje;

            case "xxo":
                mensaje = "Girar Derecha y avanzar";
                return mensaje;

            case "xoo":
                mensaje = "Girar Derecha y avanzar";
                 return mensaje;

            case "oxx":
                mensaje = "Girar Izquierda y avanzar";
                return mensaje;

            case "oxo":
                mensaje = "Girar Derecha y avanzar";
                 return mensaje;

            case "oox":
                mensaje = "Seguir Recto";
                return mensaje;

            case "ooo":
                mensaje = "Seguir Recto";
                return mensaje;
            case "xox":
                mensaje = "Seguir Recto";
                return mensaje;
            default:
                mensaje = "Laberinto mal elaborado";
        }
        return mensaje;     
    }
}
