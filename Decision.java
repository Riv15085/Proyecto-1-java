public class Decision{
	protected int degrees;
	protected String decision;
	protected boolean seguir;

	public Decision(){
		degrees = 0;
		orientation = "front"
		seguir = true;
	}

	public Decision(String des){
		seguir = true;
		switch (desicion){
			case "takeARight":
				degrees = 45;
				decision = "right"
				break;
			case "takeALeft":
				degrees = 45;
				decision = "left"
				break;
			case "keepTrue":
				degrees = 0;
				decision = "front"
				break;
			case "turnBack":
				degrees = 180;
				decision = "back"
				seguir = true;
			case "stop":
				degrees = 0;
				decision = "front"
				seguir = false;
				break;
		}
	}

}