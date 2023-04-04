package strategy;

import strategy.service.impl.Electricity;
import strategy.service.impl.FourWheel;

public class MyCar extends Car{
	
	public MyCar() {
		fuelBehavior = new Electricity();
		wheelBehavior = new FourWheel();
	}
}
