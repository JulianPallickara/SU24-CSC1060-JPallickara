
public class Character {
	private String name;
	private int hp;
	private int power;
	
	public Character() {
		hp = 10;
		power = 2;
	
	
	}

	public Character(String name, int hp, int power) {
		super();
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return name + " with " + hp + " and " +power + "power" + weapon.1.toString();
		
	}	
	
	
	}