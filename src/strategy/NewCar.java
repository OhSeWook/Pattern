package strategy;

import strategy.service.impl.Oil;
import strategy.service.impl.TwoWheel;

public class NewCar extends Car{
	
	public NewCar() {
		fuelBehavior = new Oil(); 
		wheelBehavior = new TwoWheel();
	}
}
