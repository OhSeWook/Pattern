package command;

public class CommandContol {

	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPush() {
		command.excute();
	}
}
