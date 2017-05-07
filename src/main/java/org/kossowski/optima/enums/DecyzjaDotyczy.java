package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum DecyzjaDotyczy {
	
	@XmlEnumValue( "emerytury" ) EMERYTURY( "emerytury" ),
	@XmlEnumValue( "renty" ) RENTY( "renty" ),
	@XmlEnumValue( "renty i emerytury" ) RENTY_I_EMERYTURY( "renty i emerytury" ),
	@XmlEnumValue( "zasiłku przedemerytalnego" ) ZASILKU_PRZEDEMERYTALNEGO( "zasiłku przedemerytalnego" ),
	@XmlEnumValue( "innego dokumentu" ) INNEO_DOKUMENTU( "innego dokumentu" );

	
	private String label;
	
	private DecyzjaDotyczy( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
}
