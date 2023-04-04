package strategy.service.impl;

import strategy.service.WheelBehavior;

public class FourWheel implements WheelBehavior {

	@Override
	public String getWheelCnt() {
		return "4륜 자동차";
	}

}
