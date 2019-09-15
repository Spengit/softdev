
public class Teacher extends Watchman implements Observer {
	public Subject watchmen;
	
	public Teacher(Subject watchmen) {
		this.watchmen = watchmen;
		watchmen.registerObserver(this);
	}

	
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe");
		} else {
		System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}

}
