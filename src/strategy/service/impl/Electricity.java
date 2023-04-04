package strategy.service.impl;

import strategy.service.FuelBehavior;

public class Electricity implements FuelBehavior {

	@Override
	public void getFuelName() {
		System.out.println("전기차 굴러가유~");
	}

}
