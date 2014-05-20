package entry.Q10;

public class Wand {
	private String name;
	private double power;
	
	public Wand(String name, double power) {
		setPower(power);
		this.name = Util.chkName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if(power < 0.5 || power > 100){
			throw new IllegalArgumentException("0.5-100.0Ç≈ê›íËÇµÇƒÇ≠ÇæÇ≥Ç¢ÅB");
		}
		else{
			this.power = power;
		}
	}

	
}
