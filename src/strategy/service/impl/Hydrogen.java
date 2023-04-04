package strategy.service.impl;

import strategy.service.FuelBehavior;

public class Hydrogen implements FuelBehavior {

	@Override
	public void getFuelName() {
		System.out.println("수소 폭탄차 굴러가유~");
	}


}
