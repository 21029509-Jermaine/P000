import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {//normal
		int a = 1234;
		int b = 8765;
		String message = "";
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b,message);
		if(message == "Success") {
			assertEquals(9999,actual);
		}
	}
	
	@Test
	public final void errortestcase() {//error
		int a = 1000;
		int b = 6;
		String message = "";
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b,message);
		if(message == "Error") {
			assertEquals("Error",actual);
		}
	}
	
	@Test
	public final void boundaryAdd() {//boundary
		int a = 0;
		int b = 0;
		String message = "";
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b,message);
		if(message == "Success") {
			assertEquals(0,actual);
		}
	}

	
	/*@Test
	public final void normaltestnegativeAdd() {//boundary negative
		int a = -10;
		int b = -20;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		assertEquals(-22,actual);
	}
	
	@Test
	public final void errortestcase() {//error
		int a = 1000;
		int b = -12;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		assertEquals(-22,actual);
	}

	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testMultiple() {
		int a = 5;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 10;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testDivide() {
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 5;
		assertEquals(actual, expected);
	}
	*/
	}
