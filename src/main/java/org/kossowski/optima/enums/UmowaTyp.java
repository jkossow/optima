package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum UmowaTyp {

	@XmlEnumValue( "czas nieokreślony" ) CZAS_NIEOKRESLONY( "czas nieokreślony" ),
	@XmlEnumValue( "czas określony" ) CZAS_OKRESLONY( "czas określony" ),
	@XmlEnumValue( "czas próbny" ) OKRES_PROBNY( "okres próbny" ); 
	
	private String label;
	
	private UmowaTyp( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}
