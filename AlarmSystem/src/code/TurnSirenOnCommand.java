package code;


public class TurnSirenOnCommand implements Command {

	private Siren siren;
	
	public TurnSirenOnCommand(Siren siren) {
		this.siren = siren;
	}

	@Override
	public void execute() {
		siren.turnOnSiren();
	}
}
