package org.kossowski.optima.run;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum FileRelatedTo {

	@XmlEnumValue( "dowod os" ) DOWOD_OSOBISTY, 
	@XmlEnumValue( "media" ) MEDIA, 
	@XmlEnumValue( "rmua" ) RMUA, 
	@XmlEnumValue( "zaswiadczenie zus" ) ZASW_ZUS,
	@XmlEnumValue( "emerytura" ) EMERYTURA,  
	@XmlEnumValue( "renta" ) RENTA, 
	@XmlEnumValue( "decyzja" ) DECYZJA, 
	@XmlEnumValue( "pasek" ) PASEK, 
	@XmlEnumValue( "swiadczenie przedemeryt." ) SWIADCZ_PRZEDEMERYT, 
	@XmlEnumValue( "zaswiadczenie zp" ) ZASW_ZP,
	@XmlEnumValue( "wyciag bankowy" ) WYCIAG_BANK, 
	@XmlEnumValue( "oswiadczenie" ) OSWIADCZENIE;

	
}
