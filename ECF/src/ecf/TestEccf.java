package ecf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;		

class TestEccf {

	@Test
	void testEmpty() {
		int[] emptyTable = new int[0];
		assertEquals(-1, Main.occurrence(emptyTable, 0), "Empty table doesn't have any 0 on it");
	}
	
	@Test
	void testTwoElements() {
		int[] myTable = {1,1};
		assertEquals(1, Main.occurrence(myTable, 1), "Last occurence of 1 is on key 1");
	}
	
	@Test
	void testTrois() {
		int[] myTable = {2,0,2};
		assertEquals(2, Main.occurrence(myTable, 2), "Last occurence of number 2 is on key 2");
	}

}
