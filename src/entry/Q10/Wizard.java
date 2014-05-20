package entry.Q10;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	
	public Wizard(int hp, int mp, String name, Wand wand) {
		setHp(hp);
		setMp(mp);
		setName(Util.chkName(name));
		setWand(wand);
	}

	public void heal(Hero h){
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		
		System.out.println(h.getName() + "‚ÌHP‚ğ" + recoverPoint + "‰ñ•œ‚µ‚½I");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp < 0){
			this.hp = 0;
		}
		else{
			this.hp = hp;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if(mp < 0){
			throw new IllegalArgumentException("Wizard‚ÌMP‚Í0ˆÈã‚Åİ’è‚µ‚Ä‚­‚¾‚³‚¢B");
		}
		else{
			this.mp = mp;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}
	
	
}
