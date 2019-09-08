
public class Queen extends Character {
	
	public Queen(String name) {
		super(name);
		WeaponBehavior = new WeaponKnife();
	}
	
	public void display() {
		System.out.println( name + " is a beautiful queen");
	}

}
