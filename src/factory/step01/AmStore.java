package factory.step01;

import factory.Cheese;
import factory.Greek;
import factory.Pepperoni;
import factory.Pizza;
import factory.step02.AmIngredientFactory;
import factory.step02.PizzaIngredientFactory;

public class AmStore extends SimplePizzaFactory {
	
	private PizzaIngredientFactory am = new AmIngredientFactory();

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type)) {
			pizza = new Cheese(am);
		}else if("greek".equals(type)) {
			pizza = new Greek(am);
		}else if("pepperoni".equals(type)) {
			pizza = new Pepperoni(am);
		}
		
		return pizza;
	}

}
