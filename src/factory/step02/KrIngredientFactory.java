package factory.step02;

import factory.step02.ingredient.Dough;
import factory.step02.ingredient.KrSauce;
import factory.step02.ingredient.KrThinCrustDough;
import factory.step02.ingredient.Sauce;

public class KrIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new KrThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new KrSauce();
	}
	
}
