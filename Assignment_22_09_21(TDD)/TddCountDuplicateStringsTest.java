package Assignment_22_09_21;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TddCountDuplicateStringsTest {
 
	private TddCountDuplicateStrings tddCountDuplicateStrings;
	@Before
	public void setUp() throws Exception {
		tddCountDuplicateStrings= new TddCountDuplicateStrings();
	}

	@After
	public void tearDown() throws Exception {
		tddCountDuplicateStrings=null;
	}

	@Test
	public void testTddCountDuplicateStrings_positive() {
		String[] inputArr= {"Hello","Hi","Hello","Welcome","new","Welcome","rtr","ddf","rtr","Hi"};
		int expected = 4;
		int actual = tddCountDuplicateStrings.getDuplicateCount(inputArr);
		assertEquals(expected, actual);
	}
	@Test
	public void testTddCountDuplicateStrings_negative() 
	{
		String[] inputArr = {"Hello"};
		int expected = 0;
		int actual = tddCountDuplicateStrings.getDuplicateCount(inputArr);
		assertEquals(expected, actual);
	}
	
	
	
}
