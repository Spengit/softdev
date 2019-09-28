
public class Doll  extends Toy{
	/**
	 * Doll class for factory
	 */
	public Doll() {
		this.name = "Doll"; 
	}
	
	public void assemble () {
		super.assemble();
		System.out.println("Connecting all pieces\r\n" + 
				"\r\n" + 
				"Painting the face\r\n" + 
				"\r\n" + 
				"Adding the dress\r\n" + 
				"\r\n" + 
				"Adding the shoes"); 
				
				
	}

}
