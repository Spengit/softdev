
public class Car extends Toy{
	/**
	 * Car class for factory
	 */
	public Car() {
		this.name = "Car";
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Make the body\r\n" + 
				"\r\n" + 
				"Add the wheels\r\n" + 
				"\r\n" + 
				"Paint the car");
	}

}
