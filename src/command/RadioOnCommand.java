package command;

import command.machine.Radio;

public class RadioOnCommand implements Command{

	private Radio radio;
	
	public RadioOnCommand(Radio radio){
		this.radio = radio;
	}
	
	@Override
	public void excute() {
		radio.on();
		radio.maxSound();
	}

}
