package factory;

import factory.step01.AmStore;
import factory.step01.SimplePizzaFactory;

public class Client {

	
	public static void main(String[] args) {
		
		SimplePizzaFactory s = new AmStore();
		s.order("cheese");
	}
}
