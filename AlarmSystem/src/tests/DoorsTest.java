package tests;
import org.junit.Test;

import code.Doors;


public class DoorsTest {

	@Test
	public void test() {
		Doors doors = new Doors();
		
		doors.lock();
		doors.unlock();
	}

}
