package code;

public class TurnLightsOnCommand implements Command {

	private Lights lights;
	
	public TurnLightsOnCommand(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.turnOnLights();
	}

}
