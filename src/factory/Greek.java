package factory;

import factory.step02.PizzaIngredientFactory;

public class Greek extends Pizza {
	
private PizzaIngredientFactory pizzaIngredientFactory;
	
	public Greek(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		System.out.println("Greek 피자 주문 확보");
	}

	@Override
	public void prepare() {
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		System.out.println("Greek 피자 준비중..");
	}
}
