package entry.Q10;

public class Hero {
	private int hp;
	private String name;
	
	
	public Hero(int hp, String name) {
		this.hp = hp;
		this.name = Util.chkName(name);
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
