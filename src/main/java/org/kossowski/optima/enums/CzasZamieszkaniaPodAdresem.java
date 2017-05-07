package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum CzasZamieszkaniaPodAdresem {

	@XmlEnumValue( "do 1 roku" ) DO_1_ROKU( "do jednego roku"), 
	@XmlEnumValue( "do 3 lat" ) DO_3_LAT( "do trzech lat"), 
	@XmlEnumValue( "więcej" ) WIECEJ( "więcej niż trzy lata" );
	
	 
		private String label;
		
		private CzasZamieszkaniaPodAdresem( String label ) {
			this.label = label;
		}
		
		public String getLabel() {
			return this.label;
		}
		
	
}
