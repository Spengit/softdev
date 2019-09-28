
public class Rattle extends Toy{
	/**
	 * Class for rattle object
	 */
	public Rattle() {
		this.name = "Rattle";
	}
	
	public void assemble(){
		super.assemble();
		System.out.println("Create the frame\r\n" + 
				"\r\n" + 
				"Add the pebbles\r\n" + 
				"\r\n" + 
				"Secure the sides");
	}
}
