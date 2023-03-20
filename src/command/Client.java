package command;

import command.machine.Light;
import command.machine.Radio;

public class Client {

	public static void main(String[] args) {
		
		CommandContol c = new CommandContol();
		Light light = new Light();
		Radio radio = new Radio();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		c.setCommand(lightOn);
		c.buttonPush();
		
		LightOffCommand lightoff = new LightOffCommand(light);
		c.setCommand(lightoff);
		c.buttonPush();
		
		RadioOnCommand radioOnCommand = new RadioOnCommand(radio);
		c.setCommand(radioOnCommand);
		c.buttonPush();
	}
}
