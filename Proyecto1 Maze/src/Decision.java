/**
 *
 * @author Enma Lopez
 */
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
				right = false;
                                front = false;
                                left = false;
                                mensaje = "STOP";
                                return mensaje;
                               
			case "xxo":
				right= false;
                                front = false;
                                left = true;
                                mensaje = "Girar Derecha";
				 return mensaje;
                            
			case "xoo":
				right = false;
                                front = true;
                                left = true;
                                mensaje = "Seguir Recto";
                                 return mensaje;
				
			case "oxx":
			        right = true;
                                front = true;
                                left = true;
                                mensaje = "Girar Izquierda";
                                return mensaje;
                            
	                case "oxo":
			        right= true;
                                front = false;
                                left = true;
                                mensaje = "Girar Derecha";
                                 return mensaje;
				
			case "oox":
				right = true;
				front = true;
				left = false;
                                mensaje = "Seguir Recto";
				 return mensaje;
                            
                        case "ooo":
                                right = true;
				front = true;
				left = true;
                                mensaje = "Seguir Recto";
                                return mensaje;
                        case "xox":
                                right = true;
				front = true;
				left = true;
                                mensaje = "Seguir Recto";
                                return mensaje;
                        default:
                            mensaje = "IDiota";
                            
		}
                return mensaje;
               
	}

}