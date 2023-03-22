package adapter;

public class Client {

	public static void main(String[] args) {
		
		Duck md = new MallDuck();
		
		WildTrukey wt = new WildTrukey();
		Duck dat = new DuckAdapterTurkey(wt);
		
		behiver(md);
		behiver(dat);
		
	}
	
	private static void behiver(Duck duck) {
		duck.sound();
		duck.move();
	}
}
