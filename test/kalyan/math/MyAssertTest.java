package kalyan.math;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	@Test
	void test() {
		List<String> name= Arrays.asList("Kalyan","Raman","Shiva");
		boolean expectedResult=name.contains("Kalyan");
		boolean result=true;
		assertEquals(expectedResult, result);
		assertTrue(result);
		assertEquals(5, name.size(),"Error Message");
		assertArrayEquals(new int [] {2,4}, new int [] {2,4});
	}

}
