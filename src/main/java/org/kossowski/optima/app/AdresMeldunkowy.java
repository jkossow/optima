package org.kossowski.optima.app;



import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.enums.TypAdresu;
import org.kossowski.optima.util.DateFormatterAdapter;


@XmlRootElement( name="Adres" )
@XmlAccessorType( XmlAccessType.FIELD )
public class AdresMeldunkowy extends AdresApp {

	
	
	@XmlElement( name = "MeldunekCzasowy" )
	private Boolean meldunekCzasowy;
	
	@XmlElement( name = "MeldunekCzasowyDo")
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date meldunekCzasowyDo;
	
	
	public AdresMeldunkowy() {
		setTyp( TypAdresu.ZAMELDOWANIA);
	}
	
	public AdresMeldunkowy( String ulica, String nrDomu, String nrLokalu, String kod,
			String miejscowosc, boolean czasowy, Date dataDo ) {
		
		super( ulica, nrDomu, nrLokalu, kod, miejscowosc);
		setTyp( TypAdresu.ZAMELDOWANIA );
		this.meldunekCzasowy = czasowy;
		this.meldunekCzasowyDo = dataDo;
	}
	
	
	public Boolean getMeldunekCzasowy() {
		return meldunekCzasowy;
	}
	
	public void setMeldunekCzasowy(Boolean meldunekCzasowy) {
		this.meldunekCzasowy = meldunekCzasowy;
	}
	
	public Date getMeldunekCzasowyDo() {
		return meldunekCzasowyDo;
	}
	
	public void setMeldunekCzasowyDo(Date meldunekCzasowyDo) {
		this.meldunekCzasowyDo = meldunekCzasowyDo;
	}
	
	
	
	
	
}
