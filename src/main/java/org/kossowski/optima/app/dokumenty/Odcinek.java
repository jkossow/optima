package org.kossowski.optima.app.dokumenty;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Odcinek extends Dokument {
	
	@XmlElement( name = "KwotaNetto" )
	private BigDecimal kwotaNetto;
	
	@XmlElement( name = "KwotaBrutto")
	private BigDecimal kwotaBrutto;
	
	@XmlElement( name = "ZaMiesiac" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date zaMiesiac;
	
	@XmlElement( name = "Znak" )
	private String znak;
	
	@XmlElement( name = "NazwaInstytucji")
	private String nazwaInstytucji;
	
	
	public Odcinek() {
		super( DokumentTyp.ODCINEK );
	}


	public BigDecimal getKwotaNetto() {
		return kwotaNetto;
	}


	public void setKwotaNetto(BigDecimal kwotaNetto) {
		this.kwotaNetto = kwotaNetto;
	}


	public BigDecimal getKwotaBrutto() {
		return kwotaBrutto;
	}


	public void setKwotaBrutto(BigDecimal kwotaBrutto) {
		this.kwotaBrutto = kwotaBrutto;
	}


	public Date getZaMiesiac() {
		return zaMiesiac;
	}


	public void setZaMiesiac(Date zaMiesiac) {
		this.zaMiesiac = zaMiesiac;
	}


	public String getZnak() {
		return znak;
	}


	public void setZnak(String znak) {
		this.znak = znak;
	}


	public String getNazwaInstytucji() {
		return nazwaInstytucji;
	}


	public void setNazwaInstytucji(String nazwaInstytucji) {
		this.nazwaInstytucji = nazwaInstytucji;
	}
	
	
	
	
	

}
