package org.kossowski.optima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateFormatterAdapter2  extends XmlAdapter<String, Date>{
	
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

	@Override
	public Date unmarshal(String v) throws Exception {
		
		return dateFormat.parse( v );
	}

	@Override
	public String marshal(Date v) throws Exception {
		
		return dateFormat.format( v );
	}

	
	
	
	
}
