package command;

import command.machine.Light;

public class LightOnCommand implements Command{

	private Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void excute() {
		light.show();
	}
}
