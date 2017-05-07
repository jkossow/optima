package org.kossowski.optima.converters;

import static org.junit.Assert.*;

import org.testng.annotations.Test;
import org.kossowski.optima.enums.StanCywilny;


public class StanCywilnyConverterTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testZonaty() {
		System.out.println("Stan Cywilny test");
		assertEquals( new StanCywilnyConverter().fromFactor(2), StanCywilny.ZAMEZNA_ZONATY);
	}

}
