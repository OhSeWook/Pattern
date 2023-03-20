package command;

import command.machine.Light;

public class LightOffCommand implements Command{

	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void excute() {
		light.hide();
	}

}
 