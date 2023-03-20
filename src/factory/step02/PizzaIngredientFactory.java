package factory.step02;

import factory.step02.ingredient.Dough;
import factory.step02.ingredient.Sauce;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
}
