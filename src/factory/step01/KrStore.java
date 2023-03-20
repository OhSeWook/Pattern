package factory.step01;

import factory.Cheese;
import factory.Greek;
import factory.Pepperoni;
import factory.Pizza;
import factory.step02.KrIngredientFactory;
import factory.step02.PizzaIngredientFactory;

public class KrStore extends SimplePizzaFactory {

	private PizzaIngredientFactory kr = new KrIngredientFactory();
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type)) {
			pizza = new Cheese(kr);
		}else if("greek".equals(type)) {
			pizza = new Greek(kr);
		}else if("pepperoni".equals(type)) {
			pizza = new Pepperoni(kr);
		}
		
		return pizza;
	}

}
