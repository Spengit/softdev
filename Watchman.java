//Elijah Spencer

import java.util.*;
public class Watchman implements Subject{
	ArrayList<Observer> observers;
	// int variable used for update
	int warning;
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(warning);
		}
		
	}
	
	public void issueWarning(int warning) {
		//assuming the only two inputs possible are 1 and 2 
		if(warning == 1) {
			System.out.println("WARNING:  1 trumpet was played!");
			this.setWarning(warning);
			notifyObservers();
		}else {
		System.out.println("WARNING:  2 trumpets were played!");
		this.setWarning(warning);
		notifyObservers();
		}
	}
	// used to set the warning number
	public void setWarning(int warning) {
		this.warning = warning;
	}
	
	

}
