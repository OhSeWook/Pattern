package strategy.service.impl;

import strategy.service.WheelBehavior;

public class TwoWheel implements WheelBehavior {

	@Override
	public String getWheelCnt() {
		return "2륜차 굴러가유~";
	}


}
