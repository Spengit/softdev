
public class Knight extends Character {
	
	public Knight(String name) {
		super(name);
		WeaponBehavior = new WeaponBow();
	}
	
	public void display() {
		System.out.println(name + " is a valiant knight");
		
	}

}
