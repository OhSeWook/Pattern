package factory;

import factory.step02.ingredient.Dough;
import factory.step02.ingredient.Sauce;

public abstract class Pizza {
	
	Dough dough;
	Sauce sauce;

	public void cut() {
		System.out.println("커팅완료");
	}

	public void box() {
		System.out.println("커포장팅완료");
	}
	
	public abstract void prepare();

}
