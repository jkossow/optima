package org.kossowski.optima.app;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.enums.DochodWydatekTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public abstract class DochodWydatek {

	@XmlAttribute( name="Typ" )
	private DochodWydatekTyp typ;
	
	@XmlElement( name = "Opis" )
	private String opis;
	
	@XmlElement( name = "KwotaBrutto" )
	private BigDecimal kwotaBrutto;
	
	@XmlElement( name = "KwotaNetto" )
	private BigDecimal kwotaNetto;
	
	@XmlElement( name = "OkresOd" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date okresOd;
	
	@XmlElement( name = "OkresDo" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date okresDo;
	
	@XmlElement( name = "Bezterminowo" )
	private Boolean bezterminowo;

	public DochodWydatek() {};
	
	protected DochodWydatek( DochodWydatekTyp typ ) {
		this.typ = typ;
	}
	
	public DochodWydatek( BigDecimal kwotaNetto ) {
		this.kwotaNetto = kwotaNetto;
	}
	
	public  DochodWydatek( String opis, BigDecimal kwotaBrutto, BigDecimal kwotaNetto, 
			Date okresOd, Date okresDo, boolean bezterminowo )  {
	
		this.opis = opis;
		this.kwotaBrutto = kwotaBrutto;
		this.kwotaNetto = kwotaNetto;
		this.okresOd = okresOd;
		this.okresDo = okresDo;
		this.bezterminowo = bezterminowo;
			
	}
	
	public DochodWydatekTyp getTyp() {
		return typ;
	}

	protected void setTyp(DochodWydatekTyp typ) {
		this.typ = typ;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public BigDecimal getKwotaBrutto() {
		return kwotaBrutto;
	}

	public void setKwotaBrutto(BigDecimal kwotaBrutto) {
		this.kwotaBrutto = kwotaBrutto;
	}

	public BigDecimal getKwotaNetto() {
		return kwotaNetto;
	}

	public void setKwotaNetto(BigDecimal kwotaNetto) {
		this.kwotaNetto = kwotaNetto;
	}

	public Date getOkresOd() {
		return okresOd;
	}

	public void setOkresOd(Date okresOd) {
		this.okresOd = okresOd;
	}

	public Date getOkresDo() {
		return okresDo;
	}

	public void setOkresDo(Date okresDo) {
		this.okresDo = okresDo;
	}

	public Boolean isBezterminowo() {
		return bezterminowo;
	}

	public void setBezterminowo( Boolean bezterminowo ) {
		this.bezterminowo = bezterminowo;
	}
	
	
	
	
	
}
