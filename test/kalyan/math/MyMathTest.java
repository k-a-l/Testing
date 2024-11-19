package kalyan.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	private MyMath math=new MyMath();

	@Test
	void calculateSumOfThreeArray() {
				assertEquals(9, math.calculate(new int [] {1,2,3}));

		
	}
	@Test
	void testingZero() {
		assertEquals(0, math.calculate(new int [] {}));
		

		
	}

}
