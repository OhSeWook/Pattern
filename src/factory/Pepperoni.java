package factory;

import factory.step02.PizzaIngredientFactory;

public class Pepperoni extends Pizza {

	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public Pepperoni(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		System.out.println("페페로니 피자 생성");
	}
	
	@Override
	public void prepare() {
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		System.out.println("페페로니 준비중..");
	}
}
