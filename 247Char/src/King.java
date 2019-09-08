
public class King extends Character {
	
	public King(String name) {
		super(name);
		WeaponBehavior = new WeaponSword();
	}
	
	public void display() {
		System.out.println(name + "is a Noble King");
	}

}
