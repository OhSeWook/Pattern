package strategy.service.impl;

import strategy.service.FuelBehavior;

public class Oil implements FuelBehavior {

	@Override
	public void getFuelName() {
		System.out.println("오일차 굴러가유~");
	}


}
