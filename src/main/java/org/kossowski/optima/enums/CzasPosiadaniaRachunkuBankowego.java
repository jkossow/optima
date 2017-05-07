package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnumValue;

public enum CzasPosiadaniaRachunkuBankowego {
	
	@XmlEnumValue( "Mniej niż 1 rok" ) MNIEJ_NIZ_ROK( "mniej niż rok" ),
	@XmlEnumValue( "1 rok" ) JEDEN_ROK( "jeden rok" ),
	@XmlEnumValue( "2 lata" ) DWA_LATA( "dwa lata" ),
	@XmlEnumValue( "3 lata" ) TRZY_LATA( "trzy lata" ),
	@XmlEnumValue( "4 do 5 lat" ) CZTERY_DO_PIECIU_LAT( "cztery do pięciu lat"),
	@XmlEnumValue( "6 do 10 lat" ) SZESC_DO_DZIESIECIU_LAT( "sześć do dziesięciu lat" ),
	@XmlEnumValue( "10 lub więcej lat" ) WIECEJ_NIZ_DZIESIEC_LAT( "więcej nz dziesięć lat"); 

	
	 
		private String label;
		
		private CzasPosiadaniaRachunkuBankowego( String label ) {
			this.label = label;
		}
		
		public String getLabel() {
			return this.label;
		}
		
}
