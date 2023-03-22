package adapter;

public class DuckAdapterTurkey implements Duck {
	
	private Turkey turkey; 
	
	DuckAdapterTurkey(Turkey turkey){
		this.turkey = turkey;
	}

	@Override
	public void sound() {
		turkey.shout();
	}

	@Override
	public void move() {
		turkey.fly();
	}

}
