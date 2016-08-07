
public class DecisionFactory{
	//returns a Decision based on the state of the sensor
	public Decision getDecision(boolean fleft,boolean ffront,boolean fright){
		if (!fleft&&!ffront&&!fleft){
			return new Decision("turnBack");
		}
		else if (fright){
			return new Decision("takeARight");
		}
		else if(ffront){
			return new Decision("keepTrue");
		}
		else if (fleft){
			return new Decision("takeALeft");
		}
		else{
			return Stop();
		}
	}

}