package entry.Q10;

public class App {
	public static void main(String[] argfs){
		Wand wand = new Wand("���b�h",20);
		Wizard wizard = new Wizard(35,30,"�����t",wand);
		Hero hero = new Hero(50,"�q�[���[");
		
		wizard.heal(hero);
	}
}
