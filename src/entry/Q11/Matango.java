package entry.Q11;

import entry.Q10.Hero;

public class Matango {
	int hp = 50;
	private char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("�L�m�R" + this.suffix + "�̍U��");
		System.out.println("10�̃_���[�W");
		h.setHp(h.getHp()-10);
	}
	
}
