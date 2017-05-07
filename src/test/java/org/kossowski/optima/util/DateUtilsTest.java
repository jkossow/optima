package org.kossowski.optima.util;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.testng.annotations.Test;

public class DateUtilsTest {

@SuppressWarnings("deprecation")
@Test
  public void dateDiffInYears() {
    
	  assertEquals( 0, DateUtils.dateDiffInYears( new Date(),new Date() ));
	  
	  assertEquals( 2, DateUtils.dateDiffInYears( new Date(2000,0,1), new Date( 1998,0,1) ));
	  
	  
  }
}
