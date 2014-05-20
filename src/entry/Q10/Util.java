package entry.Q10;

public class Util {
	static String chkName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("–¼‘O‚Í3•¶ŽšˆÈã‚ÅÝ’è‚µ‚Ä‚­‚¾‚³‚¢B");
		}
		else{
			return name;
		}
	}
}
