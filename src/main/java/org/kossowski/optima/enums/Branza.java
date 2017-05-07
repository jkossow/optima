package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum Branza {

	@XmlEnumValue( "służba zdrowia" ) SLUZBA_ZDROWIA( "służba zdrowia" ),
	@XmlEnumValue( "edukacja" ) EDUKACJA( "edukacja" ),
	@XmlEnumValue( "budownictwo" ) BUDOWNICTWO( "budownictwo" ),
	@XmlEnumValue( "finansowa" ) FINANSOWA( "finansowa" ),
	@XmlEnumValue( "inna" ) INNA( "inna" ); 

	 
		private String label;
		
		private Branza( String label ) {
			this.label = label;
		}
		
		public String getLabel() {
			return this.label;
		}
		
	
}
