package Assignment_22_09_21;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TddFourthElementTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	private TddFourthLargestDemo element;

	@Before
	public void setUp() throws Exception {
		element = new TddFourthLargestDemo();
	}

	@After
	public void tearDown() throws Exception {
		element=null;
	}

	@Test
	public void testArray_NthLargestElementPositive() {
		int inputArr[]= {20,32,2,43,45,23};
		int expected = 23;
		int index=4;
		int actual = element.getFourthLargest(inputArr,index);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testArray_NthLargestElementNegative() {
		int inputArr[]= {2,5,3};
		int index=4;
		try {
			element.getFourthLargest(inputArr, index);
			assertTrue(true);
		}
		catch(Exception e) {
			System.err.println(e);
			assertTrue(false);
		}
	}
	
	

}
