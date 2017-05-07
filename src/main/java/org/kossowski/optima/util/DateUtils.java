package org.kossowski.optima.util;

import java.util.Date;



public class DateUtils {

	public static int dateDiffInYears( Date d1, Date d2 ) {
		
		
		
		long diff = d1.getTime() - d2.getTime();
		
		return new Long( diff / 1000 / 60 / 60 /24 /365 ).intValue() ;
	}
	
	
	
	
}
