package Assignment_22_09_21;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TDDPrimeNumberCountTest {

	private TDDPrimeNumberCount countPrimeNumber;

	@Before
	public void setUp() throws Exception {
		countPrimeNumber = new TDDPrimeNumberCount();
	}

	@After
	public void tearDown() throws Exception {
		countPrimeNumber=null;
	}

	@Test
	public void testCountPrime_positive() 
	{
		int[] inputArr= {1,2,4,3,21,33,4,13,17};
		int expected = 4;
		int actual = countPrimeNumber.getCount(inputArr);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCountPrime_negative() {
		int[] inputArr= {};
		try {
		countPrimeNumber.getCount(inputArr);
		assertTrue(false);
		}
		catch(RuntimeException e) {
			assertTrue(true);
			System.err.println(e.getMessage());
		}
	}


	
}
