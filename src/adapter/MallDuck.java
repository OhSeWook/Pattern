package adapter;

public class MallDuck implements Duck{

	@Override
	public void sound() {
		System.out.println("오리 꾁꾁~");
	}

	@Override
	public void move() {
		System.out.println("오리 수영~~~");
	}

}
