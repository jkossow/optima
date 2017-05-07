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
public class ZajecieKomornicze extends DochodWydatek {

	
	public ZajecieKomornicze() {
		super( DochodWydatekTyp.ZAJECIE_KOMORNICZE );
	}
	
	public ZajecieKomornicze( BigDecimal kwotaNetto ) {
		super( kwotaNetto );
		setTyp( DochodWydatekTyp.ZAJECIE_KOMORNICZE );
	}
	
	public  ZajecieKomornicze( String opis, BigDecimal kwotaBrutto, BigDecimal kwotaNetto, 
			Date okresOd, Date okresDo, boolean bezterminowo ) {
		
		
		super(opis, kwotaBrutto, kwotaNetto, okresOd, okresDo, bezterminowo);
		setTyp( DochodWydatekTyp.ZAJECIE_KOMORNICZE );

	}
	
	
}
