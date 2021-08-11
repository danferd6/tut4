package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCalc{
	
	@Test
	void testAdd() {
		assertEquals(calc.add(2, 3), 5);
	}
	
	@Test
	void testSubtract() {
		assertEquals(calc.subtract(5, 3), 2);
	}
}