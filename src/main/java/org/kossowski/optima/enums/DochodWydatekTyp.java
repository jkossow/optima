package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( String.class )
public enum DochodWydatekTyp {

	@XmlEnumValue(  "Renta" ) RENTA( "renta", 24, 2 ),
	@XmlEnumValue(  "Emerytura" ) EMERYTURA( "emerytura", 25, 2 ),
	@XmlEnumValue(  "ZasilekPrzedemerytalny" ) ZASILEK_PRZEDEMERYTALNY( "zasiłek przemerytalny", 18, 2 ),
	@XmlEnumValue(  "Praca" ) PRACA( "praca", 11, 1 ),
	@XmlEnumValue(  "UmowaZlecenie" ) UMOWA_ZLECENIE( "umowa zlecenie", 26, 1 ),
	@XmlEnumValue(  "UmowaDzielo" ) UMOWA_DZIELO( "umowa o dzieło", 22, 1 ),
	@XmlEnumValue(  "DzialalnoscGospodarcza" ) DZIALALNOSC_GOSPODARCZA( "działalność gospodarcza", 16, 3 ),
	@XmlEnumValue(  "PracaBrakDokumentow" ) PRACA_BRAK_DOKUMENTOW( "praca - brak dokumentów", 27, 1 ),
	@XmlEnumValue(  "MOPS" ) MOPS( "MOPS", 28, 2 ),
	@XmlEnumValue(  "GospodarstwoRolne" ) GOSPODARSTWO_ROLNE( "gospodarstwo rolne", 21, 3 ),
	@XmlEnumValue(  "InneDochod" ) INNE_DOCHOD( "inne (dochod)", 29, -1 ),
	@XmlEnumValue(  "ProgramSocjalny" ) PROGRAM_SOCJALNY( "program socjalny", 30, 2 ),
	@XmlEnumValue(  "ZajecieKomornicze" ) ZAJECIE_KOMORNICZE( "zajęcie komornicze", 31, -1 ),
	@XmlEnumValue(  "InneWydatek" ) INNE_WYDATKI( "inne (wydatek)", 32, -1 );
	
	private String label;
	private int path;
	private int factorId;
	
	private DochodWydatekTyp( String label, int factorId, int path ) {
		this.label = label;
		this.factorId = factorId;
		this.path = path;
	}
	
	


	public String getLabel() {
		return label;
	}

	public int getPath() {
		return path;
	}

	public int getFactorId() {
		return factorId;
	}

	public static DochodWydatekTyp[] getDochody() {
		return dochody;
	}

	public static DochodWydatekTyp[] getWydatki() {
		return wydatki;
	}




	private static DochodWydatekTyp[]  dochody = new DochodWydatekTyp[] 
			{ RENTA, EMERYTURA, ZASILEK_PRZEDEMERYTALNY, PRACA, UMOWA_ZLECENIE, UMOWA_DZIELO,
			  DZIALALNOSC_GOSPODARCZA, PRACA_BRAK_DOKUMENTOW, MOPS, GOSPODARSTWO_ROLNE, INNE_DOCHOD, PROGRAM_SOCJALNY};
	
	private static DochodWydatekTyp[]  wydatki = new DochodWydatekTyp[] 
			{ ZAJECIE_KOMORNICZE, INNE_WYDATKI };
	
	public static DochodWydatekTyp[] getDochodyValues() {
		return dochody;
	}
	
	public static DochodWydatekTyp[] getWydatkiValues() {
		return wydatki;
	}
	
	
	
}
