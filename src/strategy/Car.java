package strategy;

import strategy.service.FuelBehavior;
import strategy.service.WheelBehavior;

public abstract class Car {

	FuelBehavior fuelBehavior;
	
	WheelBehavior wheelBehavior;
	
	public FuelBehavior getFuelBehavior() {
		return fuelBehavior;
	}

	public void setFuelBehavior(FuelBehavior fuelBehavior) {
		this.fuelBehavior = fuelBehavior;
	}

	public WheelBehavior getWheelBehavior() {
		return wheelBehavior;
	}

	public void setWheelBehavior(WheelBehavior wheelBehavior) {
		this.wheelBehavior = wheelBehavior;
	}

	public void carMove() {
		System.out.println("차 굴러가유~! 연료는 뭐고 바퀴는 몇개유~");
		String cnt = wheelBehavior.getWheelCnt();
		System.out.println(cnt);
		fuelBehavior.getFuelName();
		
		System.out.println(  );
	}
	
}
