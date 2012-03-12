package code;


public class LockDoorsCommand implements Command {

	private Doors doors;
	
	public LockDoorsCommand(Doors doors) {
		this.doors = doors;
	}

	@Override
	public void execute() {
		doors.lock();
	}

}
