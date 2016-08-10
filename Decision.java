/**
 *
 * @author Enma Lopez
 */
public class Decision {
        private boolean right;
        private boolean left;
	private boolean front;
        private String mensaje;
	

	public Decision(){
	    right = false;
            left = false;
            front = false;
    
	}

	public Decision(String opcion){
		switch (opcion){
			case "XXX":
				right = false;
                                front = false;
                                left = false;
                                mensaje = "STOP";
                                break;
                               
			case "XXO":
				right= false;
                                front = false;
                                left = true;
                                mensaje = "Girar izquierda";
				break;
                            
			case "XOO":
				right = false;
                                front = true;
                                left = true;
                                mensaje = "Seguir Recto";
                                break;
				
			case "OXX":
			        right = true;
                                front = true;
                                left = true;
                                mensaje = "Girar derecha";
                                break;
                            
	                case "OXO":
			        right= true;
                                front = false;
                                left = true;
                                mensaje = "Seguir derecha";
                                break;
				
			case "OOX":
				right = true;
				front = true;
				left = false;
                                mensaje = "Seguir recto";
				break;
                            
                        case "OOO":
                                right = true;
				front = true;
				left = true;
                                mensaje = "Seguir recto";
                                break;
                            
		}
	}

}
