package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum ZrodloInformacjiEnum {
	
	@XmlEnumValue( "ulotka / plakat ") ULOTKA_PLAKAT( "ulotka / plakat"),
	@XmlEnumValue( "prasa" ) PRASA( "prasa" ),
	@XmlEnumValue( "Internet" ) INTERNET( "internet" ),
	@XmlEnumValue( "od Przedstawiciela" ) OD_PRZEDSTAWICIELA( "od przedstawiciela" ),
	@XmlEnumValue( "od znajomego" ) OD_ZNAJOMEGO( "od znajomego" ),
	@XmlEnumValue( "był już klientem Optima S.A." ) BYL_JUZ_KLIENTEM_OPTIMA_SA("był już klientem Optima SA" ),
	@XmlEnumValue( "plakat") PLAKAT( "plakat" ),
	@XmlEnumValue( "radio" ) RADIO( "radio" ),
	@XmlEnumValue( "tv") TV( "tv" );

	
	private String label;
	
	private ZrodloInformacjiEnum( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}	
	 
	
	 

}
