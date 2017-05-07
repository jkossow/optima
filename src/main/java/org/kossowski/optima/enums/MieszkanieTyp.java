package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )

public enum MieszkanieTyp {
	
	@XmlEnumValue( "komunalne" ) KOMUNALNE( "komunalne", 13 ),
	@XmlEnumValue( "własnościowe" ) WLASOSCIOWE( "własnościowe", 3 ),
	@XmlEnumValue( "wynajmowane" ) WYNAJMOWANE( "wynajmowane", 4 ),
	@XmlEnumValue( "dom jednorodzinny" ) DOM_JEDNORODZINNY( "dom jednorodzinny", 9 ),
	@XmlEnumValue( "TBS" ) TBS( "TBS", 10 ), 
	@XmlEnumValue( "spódzielcze" ) SPOLDZIELCZE( "spółdzielcze", 8 ),
	@XmlEnumValue( "inne" ) INNE( "inne", 11 ),
	@XmlEnumValue( "brak" ) BRAK( "brak", 12 );
	
	private String label;
	private Integer factorId;
	
	private MieszkanieTyp( String label, Integer factorId ) {
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
