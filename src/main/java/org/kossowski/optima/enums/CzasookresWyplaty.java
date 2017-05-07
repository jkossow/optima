package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum CzasookresWyplaty {

	@XmlEnumValue( "Tygodniowo" ) TYGODNIOWO( "tygodniowo" ),
	@XmlEnumValue( "Co 2 tygodnie" ) CO_2_TYGODNIE( "co 2 tygodnie" ),
	@XmlEnumValue( "Co 4 tygodnie" ) CO_4_TYGODNIE( "co 4 tygodnie" ),
	@XmlEnumValue( "Miesięcznie" ) MIESIECZNIE( "miesięcznie" ); 
	
	 
		private String label;
		
		private CzasookresWyplaty( String label ) {
			this.label = label;
		}
		
		public String getLabel() {
			return this.label;
		}
		
}
