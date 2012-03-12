package code;

public class UnlockDoorsCommand implements Command {

	private Doors doors;
	
	public UnlockDoorsCommand(Doors doors) {
		this.doors = doors;
	}

	@Override
	public void execute() {
		doors.unlock();
	}

}
