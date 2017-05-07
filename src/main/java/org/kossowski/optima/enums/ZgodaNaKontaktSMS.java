package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnumValue;

public enum ZgodaNaKontaktSMS {
	
	@XmlEnumValue( "SMS" ) SMS( "sms" ),
	@XmlEnumValue( "e-mail" ) EMAIL( "e-mail" ) ,
	@XmlEnumValue( "oba" ) OBA( "oba" ),
	@XmlEnumValue( "nie" ) NIE( "nie" );

	private String label;
	
	private ZgodaNaKontaktSMS( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}

}
