package kalyan.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterAnotationTest {
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");//Cleanup after the test 	
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");	
	}

	@Test
	void test0() {
		System.out.println("test0");
	}
	@Test
	void test1() {
		System.out.println("test1");
	}
	@Test
	void test2() {
		System.out.println("test2");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	@Test
	void test4() {
		System.out.println("test4");
	}

}
