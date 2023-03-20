package factory.step01;

import factory.Pizza;

public abstract class SimplePizzaFactory {
	
	public Pizza order(String type) {
		Pizza p = createPizza(type);
		p.prepare();
		p.cut();
		p.box();
		return p;
	}

	protected abstract Pizza createPizza(String type);

}



