package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum Etat {

	@XmlEnumValue( "cały" ) CALY( "cały" ),
	@XmlEnumValue( "część" ) CZESC( "część" );
	
	private String label;
	
	private Etat( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}
