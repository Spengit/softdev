
public class Knight extends Watchman implements Observer {
	private Subject watchmen;
	
	public Knight(Subject watchmen) {
		this.watchmen = watchmen;
		watchmen.registerObserver(this);
		
	}

	
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Knight: Helps everyone get home safe");
		} else {
		System.out.println("Knight: Prepares for battle");
		}
	}

}
