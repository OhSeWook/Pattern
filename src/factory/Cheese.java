package factory;

import factory.step02.PizzaIngredientFactory;

public class Cheese extends Pizza {

	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public Cheese(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		System.out.println("치즈피자 주문 확보");
	}

	@Override
	public void prepare() {
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		System.out.println("치즈피자 준비중..");
	}
}
