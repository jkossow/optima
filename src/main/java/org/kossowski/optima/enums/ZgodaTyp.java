package org.kossowski.optima.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum( Integer.class )
public enum ZgodaTyp {
	
	@XmlEnumValue( "1" ) ZGODA_1( 1, "zgoda 1" ),
	@XmlEnumValue( "2" ) ZGODA_2( 2, "zgoda 2" ),
	@XmlEnumValue( "3" ) ZGODA_3( 3, "zgoda 3" ),
	@XmlEnumValue( "4" ) ZGODA_4( 4, "zgoda 4" ),
	@XmlEnumValue( "5" ) ZGODA_5( 5, "zgoda 5" ),
	@XmlEnumValue( "6" ) ZGODA_6( 6, "zgoda 6" ),
	@XmlEnumValue( "7" ) ZGODA_7( 7, "zgoda 7" ),
	@XmlEnumValue( "12" ) ZGODA_12( 12, "zgoda 12" ),
	@XmlEnumValue( "13" ) ZGODA_13( 13, "zgoda 13" );
	
	private int id;
	private String label;

    private ZgodaTyp(int id, String label) {
        
        this.id = id;
        this.label = label;
    }

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}
    
    
    
	
	/*
	1	Zgoda na prowadzenie działań marketingowych
	2	Zgoda na przekazywanie danych osobowych za granicę do DFC Global Corp
	3	Zgoda na przekazywanie danych osobowych za granicę do DFG UK
	4	Zgoda na przekazywanie danych osobowych za granicę do Risicum Oyj
	5	Zgoda na weryfikację danych w zewnętrznych bazach danych Biur Informacji Gospodarczych
	6	Zgoda na zasięganie informacji od podmiotów DFC Global Group
	7	Zgoda na przesyłanie informacji handlowych drogą elektroniczną
	12	Zgoda na weryfikację danych w zewnętrznych bazach danych Biura Informacji Kredytowej
	13	Zgoda na przekazywanie danych do zewnętrznych baz danych Biura Informacji Kredytowej
*/
 /*
    @XmlEnumValue( "1" ) PROWADZENIE_DZIALAN_MARKETINGOWYCH( 1 ),
	@XmlEnumValue( "2" ) PRZEKAZYWANE_DANYCH_ZA_GRANOCE_DO_DFC_GLOBAL_CORP( 2 ),
	@XmlEnumValue( "3" ) PRZEKAZYWANIE_DANYCH_ZA_GRANICE_DO_DFG_UK( 3 ),
	@XmlEnumValue( "4" ) PRZEKAZYWANIE_DANYCH_ZA_GRANICE_RISICUM_QYJ( 4 ),
	@XmlEnumValue( "5" ) WERYFIKACJE_DANYCH_W_ZEWNETRZNYCH_BAZACH_BIG( 5 ),
	@XmlEnumValue( "6" ) ZASIEGANIE_INORMACJI_OD_PODMIOTOW_DFC_GLOBAL_GROUP( 6 ),
	@XmlEnumValue( "7" ) PRZESYLANIE_INFORMACJI_HANDLOWYCH_DROGA_ELEKTRONICZNA( 7 ),
	@XmlEnumValue( "12" ) WERYFIKACJA_DANYCH_W_ZEWNETRZNYCH_BAZACH_BIK( 12 ),
	@XmlEnumValue( "13" ) PRZEKAZYWANIE_DANYCH_DO_ZEWNETRNYCH_BAZ_BIK( 13 );
*/

}
