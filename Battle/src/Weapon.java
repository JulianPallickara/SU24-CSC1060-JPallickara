
public class Weapon {
	private String name;
	private int damage;
	
	
	public Weapon() {
		name = null;
		damage = 0;
}


	public Weapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
		hero.setWeapon("sword", 12);
		
		weapon1 = new Weapon(null, damage);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setWeaponName(String name) {
		this.weapon1.setName(name);
	}
	
	public void setWeaponDamage(int damage) {
		this.weapon1.setDamage(damage);
	}
	public Object doDamage(Character c) {
		
		
		return hp;
	}
	public void setWeapon(String name, int damage) {
		weapon1 = new Weapon(name, damage);
	}
	
	public void recieveDamage(int damage) {
		this.hp -= damage;
	}
	
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + "]";
	}
}


