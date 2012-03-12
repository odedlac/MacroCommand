package code;

public class TurnLightsOffCommand implements Command {

	private Lights lights;
	
	public TurnLightsOffCommand(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.turnOffLights();
	}
}
