//Elijah Spencer

public abstract class Character {
	protected String name;
	protected WeaponBehavior WeaponBehavior;
	
	public Character(String name) {
		this.name = name;
	}
	
	public void attack() {
		WeaponBehavior.attack();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.WeaponBehavior = wb;
		
	}
	public void display() {
		
	}

}
