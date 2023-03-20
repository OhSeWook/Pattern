package factory.step02;

import factory.step02.ingredient.AmMaxCrustDough;
import factory.step02.ingredient.AmSauce;
import factory.step02.ingredient.Dough;
import factory.step02.ingredient.Sauce;

public class AmIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new AmMaxCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new AmSauce();
	}
	

}
