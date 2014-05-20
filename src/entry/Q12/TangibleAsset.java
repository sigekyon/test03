package entry.Q12;

public abstract class TangibleAsset extends Asset implements Thing{
	private double weight;
	private String color;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
