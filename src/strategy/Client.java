package strategy;

import strategy.service.impl.Hydrogen;

public class Client {

	public static void main(String[] args) {
		
		Car car = new MyCar();
		car.carMove();
		
		
		System.out.println("전기차에 수소 충전한다~");
		car.setFuelBehavior(new Hydrogen());
		car.carMove();
	}
}
