package entry.Q8;

public class Main2 {
	public static void main(String[] args) throws InterruptedException{
		Cleric cleric = new Cleric();
		cleric.selfAid();
		System.out.print("MP��" + cleric.pray(7) + "�񕜂����B");
	}
}
