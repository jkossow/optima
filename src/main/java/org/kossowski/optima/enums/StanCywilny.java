package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlEnum( String.class )
public enum StanCywilny  {
	
	
	
	@XmlEnumValue( "panna / kawaler" ) PANNA_KAWALER ("panna / kawaler", 3 ),
	@XmlEnumValue( "zamężna / żonaty" ) ZAMEZNA_ZONATY("zamężna / żonaty", 2 ),
	@XmlEnumValue( "wdowa / wdowiec" ) WDOWA_WDOWIEC("wdowa / wdowiec", 5 ),
	@XmlEnumValue( "rozwiedziona / rozwiedziony" ) ROZWIEDZIONY_ROZWIEDZIONA("rozwiedziony / rozwiedziona", 4 ),
	@XmlEnumValue( "konkubina / konkubent" ) KONKUBINA_KONKUBENT("konkubina / konkubent", 7 ),
	@XmlEnumValue( "klient odmawia podania" ) KLIENT_ODMAWIA_PODANIA("klient odmawia podania", 8);
	 
	private String label;
	private Integer factorId;
	
	private StanCywilny( String label, Integer factorId ) {
		
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
