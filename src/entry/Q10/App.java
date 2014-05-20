package entry.Q10;

public class App {
	public static void main(String[] argfs){
		Wand wand = new Wand("ロッド",20);
		Wizard wizard = new Wizard(35,30,"魔導師",wand);
		Hero hero = new Hero(50,"ヒーロー");
		
		wizard.heal(hero);
	}
}
