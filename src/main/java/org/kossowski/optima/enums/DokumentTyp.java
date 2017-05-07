package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum DokumentTyp {

	@XmlEnumValue( "Rmua" ) RMUA( "RMUA", 2 ),
	@XmlEnumValue( "ZaswiadczenieZus" ) ZASWIADCZENIE_ZUS( "zaświadczenie z ZUS", 2),
	@XmlEnumValue( "Odcinek" ) ODCINEK( "odcinek", 2 ),
	@XmlEnumValue( "Decyzja" ) DECYZJA( "decyzja", 2 ),
	@XmlEnumValue( "Pasek" ) PASEK( "pasek", 1 ),
	@XmlEnumValue( "ZaswiadczenieZp" ) ZASWIADCZENIE_ZP( "zaświadczenie z pracy", 1),
	@XmlEnumValue( "WyciagBankowy" ) WYCIAG_BANKOWY( "wyciag bankowy", 1 ),
	@XmlEnumValue( "DzialalnoscGosp" ) DZIALALNOSC_GOSP( "działalnośc gospodarcza", 3 ),
	@XmlEnumValue( "Oswiadczenie" ) OSWIADCZENIE( "oświadczenie", 1 ),
	@XmlEnumValue( "Inne" ) INNE( "inne", 3 );
	
	private String label;
	private Integer path;
	
	private DokumentTyp( String label, Integer path ) {
		this.label = label;
		this.path = path;
	}
	
	public String getLabel() {
		return this.label;
	}

	public Integer getPath() {
		return path;
	}

	
	
	
}
