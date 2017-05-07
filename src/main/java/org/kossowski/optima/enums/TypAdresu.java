package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum TypAdresu {

	@XmlEnumValue( "meldunkowy") ZAMELDOWANIA( "meldunkowy"),
	@XmlEnumValue( "zamieszkania") ZAMIESZKANIA( "zamieszkania" );
	
	private String label;
	
	private TypAdresu( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}
