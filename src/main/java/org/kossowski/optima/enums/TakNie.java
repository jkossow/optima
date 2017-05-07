package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

// słownik używany tylko przy zaswiadczeniu z pracy

@XmlType
@XmlEnum( String.class )
public enum TakNie {

	@XmlEnumValue( "tak" ) TAK( "tak" ),
	@XmlEnumValue( "nie" ) NIE( "nie" );
	
	private String label;
	
	private TakNie( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}
