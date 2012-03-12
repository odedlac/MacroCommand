package tests;

import org.junit.Test;

import code.Lights;

public class LightsTest {

	@Test
	public void test() {
		Lights lights = new Lights();
		
		lights.turnOnLights();
		lights.turnOffLights();
	}

}
