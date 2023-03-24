package facade;

public class FacadeHome {

	private Movice movice;
	private Screen screen;
	
	FacadeHome(Movice movice, Screen screen){
		this.movice = movice;
		this.screen = screen;
	}
	
	public void watchMovie(String name) {
		screen.showScreen();
		movice.startMovice(name);
	}
}
