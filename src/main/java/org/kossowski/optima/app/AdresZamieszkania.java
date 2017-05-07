 package org.kossowski.optima.app;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;
import org.kossowski.optima.enums.TypAdresu;

@XmlRootElement( name="Adres" )
@XmlAccessorType( XmlAccessType.FIELD )
public class AdresZamieszkania extends AdresApp {

	
	public AdresZamieszkania() {
		super( TypAdresu.ZAMIESZKANIA );
	};
	
	public AdresZamieszkania( String ulica, String nrDomu, String nrLokalu, String kod,
			String miejscowosc, CzasZamieszkaniaPodAdresem czasZamieszkiwania ) {
		
		super( ulica, nrDomu, nrLokalu, kod, miejscowosc );
		this.czasZamieszkaniaPodAdresem = czasZamieszkiwania;
		setTyp( TypAdresu.ZAMIESZKANIA );
		
	}
	
	
	@XmlElement( name = "CzasZamieszkaniaPodAdresem" )
	private CzasZamieszkaniaPodAdresem czasZamieszkaniaPodAdresem;

	public CzasZamieszkaniaPodAdresem getCzasZamieszkaniaPodAdresem() {
		return czasZamieszkaniaPodAdresem;
	}

	public void setCzasZamieszkaniaPodAdresem(CzasZamieszkaniaPodAdresem czasZamieszkaniaPodAdresem) {
		this.czasZamieszkaniaPodAdresem = czasZamieszkaniaPodAdresem;
	}

	
	
	
}
