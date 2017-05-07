package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum OkresNaliczeniaKwotyBrutto {

	@XmlEnumValue( "1 miesiąc" ) JEDEN_MIESIAC( "jeden miesiąc" ),
	@XmlEnumValue( "3 miesiące łącznie" ) TRZY_MIESIACE_LACZNIE( "trzy miesiące "),
	@XmlEnumValue( "średnia z 3 ost. m-cy" ) SREDNIA_Z_TRZECH_OSTATNICH_MIESIECY( "średnia z trzech ostanich miesięcy" );
	
	
	private String label;
	
	private OkresNaliczeniaKwotyBrutto( String label ) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
}
