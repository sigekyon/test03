package entry.Q12;
/* 12-2
 * �A)Asset �C)IntangibleAsset �E)Patent
 */

public abstract class Asset {
	private String name;
	private int price;
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
