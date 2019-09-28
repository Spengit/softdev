
public class ToyStore {
	/**
	 * Toy store class in factory
	 */
	public Toy orderToy(String type) {
		if(type.equalsIgnoreCase("car")) {
			Car car = new Car();
			car.assemble();
			return car;
		} else if(type.equalsIgnoreCase("rattle")) {
			Rattle rattle = new Rattle();
			rattle.assemble();
			return rattle;
		} else if (type.equalsIgnoreCase("doll")) {
			Doll doll = new Doll();
			doll.assemble();
			return doll;
		}
		return null;
		
	}

}
