package code;


public class TurnSirenOffCommand implements Command {

	private Siren siren;
	
	public TurnSirenOffCommand(Siren siren) {
		this.siren = siren;
	}

	@Override
	public void execute() {
		siren.turnOffSiren();
	}
}
