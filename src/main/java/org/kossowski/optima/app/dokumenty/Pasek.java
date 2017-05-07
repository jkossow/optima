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
public class Pasek extends Dokument {
	
	@XmlElement( name = "ZaMiesiac")
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date zaMiesiac;
	
	@XmlElement( name = "DodatkiObciazenia" )
	private BigDecimal dodatkiObciazenia;
	
	@XmlElement( name = "PodstawaWymiaruSKladki" )
	private BigDecimal podstawaWymiaruSkladki;
	
	@XmlElement( name = "Pozyczki")
	private BigDecimal pozyczki;
	
	@XmlElement( name = "KwotaNettoPoPotraceniach" )
	private BigDecimal kwotaNettoPoPotraceniach;
	
	public Pasek() {
		super( DokumentTyp.PASEK );
	}

	public Date getZaMiesiac() {
		return zaMiesiac;
	}

	public void setZaMiesiac(Date zaMiesiac) {
		this.zaMiesiac = zaMiesiac;
	}

	public BigDecimal getDodatkiObciazenia() {
		return dodatkiObciazenia;
	}

	public void setDodatkiObciazenia(BigDecimal dodatkiObciazenia) {
		this.dodatkiObciazenia = dodatkiObciazenia;
	}

	public BigDecimal getPodstawaWymiaruSkladki() {
		return podstawaWymiaruSkladki;
	}

	public void setPodstawaWymiaruSkladki(BigDecimal podstawaWymiaruSkladki) {
		this.podstawaWymiaruSkladki = podstawaWymiaruSkladki;
	}

	public BigDecimal getPozyczki() {
		return pozyczki;
	}

	public void setPozyczki(BigDecimal pozyczki) {
		this.pozyczki = pozyczki;
	}

	public BigDecimal getKwotaNettoPoPotraceniach() {
		return kwotaNettoPoPotraceniach;
	}

	public void setKwotaNettoPoPotraceniach(BigDecimal kwotaNettoPoPotraceniach) {
		this.kwotaNettoPoPotraceniach = kwotaNettoPoPotraceniach;
	}
	
	
	
	

}
