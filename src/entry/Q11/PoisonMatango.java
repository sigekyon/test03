package entry.Q11;

import entry.Q10.Hero;

public class PoisonMatango extends Matango {

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	private int cntPsn = 5;

	@Override
	public void attack(Hero h) {
		int dmg;
		super.attack(h);
		double hHp = h.getHp();
		
		if(cntPsn != 0 && hHp > 0){
			System.out.println("さらに毒の胞子をばらまいた！");
			dmg = (int) Math.ceil(hHp/5.0);
			h.setHp((int)(hHp - dmg));
			System.out.println(dmg + "ポイントのダメージ");
			this.cntPsn --;
			}
	}

	public int getCntPsn() {
		return cntPsn;
	}

	public void setCntPsn(int cntPsn) {
		this.cntPsn = cntPsn;
	}
	
}