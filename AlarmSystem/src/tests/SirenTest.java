package tests;

import org.junit.Test;

import code.Siren;

public class SirenTest {

	@Test
	public void test() {
		Siren siren = new Siren();		
		siren.turnOnSiren();
		siren.turnOffSiren();
	}

}
