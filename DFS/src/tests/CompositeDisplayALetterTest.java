/**
 * 
 */
package tests;

import org.junit.Test;

import code.CompositeDisplayALetter;
import code.DisplayALetter;
import code.DisplayTheLetterA;
import code.DisplayTheLetterB;
import code.DisplayTheLetterC;

/**
 * @author oded
 *
 */
public class CompositeDisplayALetterTest {

	@Test
	public void test() {
		DisplayALetter a = new DisplayTheLetterA();
		DisplayALetter b = new DisplayTheLetterB();
		DisplayALetter c = new DisplayTheLetterC();
		
		CompositeDisplayALetter top = new CompositeDisplayALetter();
		CompositeDisplayALetter bottomLeft = new CompositeDisplayALetter();
		CompositeDisplayALetter bottomRight = new CompositeDisplayALetter();
		
		top.add(bottomLeft);
		top.add(bottomRight);
		bottomLeft.add(a);
		bottomRight.add(b);
		bottomRight.add(c);
		
		top.displayYourLetter();		
	}

}
