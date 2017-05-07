package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum WyksztalcenieEnum {
	
	@XmlEnumValue( "podstawowe" ) PODSTAWOWE( "podstawowe", 6 ),
	@XmlEnumValue( "zawodowe" ) ZAWODOWE( "zawodowe", 2 ),
	@XmlEnumValue( "średnie") SREDNIE( "średnie" , 3),
	@XmlEnumValue( "szkoła policealna" ) SZKOLA_POLICEALNA( "szkoła policealna", 7 ),
	@XmlEnumValue( "wyższe - licencjat" ) WYZSZE_LICENCJAT( "wyższe - licencjat", 8 ),
	@XmlEnumValue( "wyższe - magister" ) WYZSZE_MAGISTER("wyższe magister", 9 ); 

	
	private String label;
	private Integer factorId;
	
	private WyksztalcenieEnum( String label, Integer factorId ) {
		this.label = label;
		this.factorId = factorId;
	}
	
	public String getLabel() {
		return this.label;
	}

	public Integer getFactorId() {
		return factorId;
	}

	
	
}
