package org.kossowski.optima.app.dochodWydatek;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.enums.DochodWydatekTyp;


@XmlRootElement( name = "DochodWydatek" )
@XmlAccessorType( XmlAccessType.FIELD )
public class DochodDzialalnoscGospodarcza extends DochodWydatek {

	
	public DochodDzialalnoscGospodarcza() {
		super( DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA );
	}
	
	public DochodDzialalnoscGospodarcza( BigDecimal kwotaNetto ) {
		super( kwotaNetto );
		setTyp( DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA );
	}
	
	public  DochodDzialalnoscGospodarcza( String opis, BigDecimal kwotaBrutto, BigDecimal kwotaNetto, 
			Date okresOd, Date okresDo, boolean bezterminowo ) {
		
		
		super(opis, kwotaBrutto, kwotaNetto, okresOd, okresDo, bezterminowo);
		setTyp( DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA );

	}


}
