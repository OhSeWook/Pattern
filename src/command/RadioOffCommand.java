package command;

import command.machine.Radio;

public class RadioOffCommand implements Command{

	private Radio radio;
	
	public RadioOffCommand(Radio radio){
		this.radio = radio;
	}
	
	@Override
	public void excute() {
		radio.off();
	}

}
