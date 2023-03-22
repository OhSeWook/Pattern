package adapter;

public class WildTrukey implements Turkey {

	@Override
	public void shout() {
		System.out.println("칠면조 칠칠 사운드~");
	}

	@Override
	public void fly() {
		System.out.println("칠면조 날아다니기~");
	}

}
