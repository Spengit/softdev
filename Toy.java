//Elijah Spencer
public class Toy {
	/**
	 * base class for toys
	 */
	protected String name;
	
	public void assemble() {
		System.out.println("putting together a " + this.name + "\n");
	}
	
	public void boxToy() {
		System.out.println("Putting the " +  this.name + " in a box");
	}
	
	public void priceToy() {
		System.out.println("adding a price on " + this.name);
	}

}
