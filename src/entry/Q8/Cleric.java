package entry.Q8;

import java.util.Random;

public class Cleric {
	String name = "���E��";
	static final int MAXHP = 50;
	static final int MAXMP = 10;
	int curHP = 50;
	int curMP = 10;
	
	void selfAid(){
		this.curMP -= 5;
		this.curHP = MAXHP;
		System.out.println("�Z���t�G�C�h���������BHP���ő�l�܂ŉ񕜂����B");
	}
	
	int pray(int s) throws InterruptedException{
		int aidMP = 0;
		int aidMP2 = 0;
		
		System.out.println("�F��n�߂�");
		aidMP += s + new Random().nextInt(3);
		aidMP2 = Math.min(aidMP, MAXMP-this.curMP);
		return aidMP2;
	}
	
}
