package entry.Q8;

public class Main2 {
	public static void main(String[] args) throws InterruptedException{
		Cleric cleric = new Cleric();
		cleric.selfAid();
		System.out.print("MP‚ª" + cleric.pray(7) + "‰ñ•œ‚µ‚½B");
	}
}
