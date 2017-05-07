package org.kossowski.optima.app.dokumenty;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Adres;
import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.Telefon;
import org.kossowski.optima.app.Umowa;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Oswiadczenie extends Dokument {

	@XmlElement( name = "NazwaPracodawcy" )
	private String nazwaPracodawcy;
	
	@XmlElement( name = "Adres" )
	private Adres adres = new Adres();
	
	@XmlElement( name = "Telefon" )
	private Telefon telefon = new Telefon();
	
	@XmlElement( name = "ZgodaNaKontakt" )
	private Boolean zgodaNaKontakt;
	
	@XmlElement( name = "Umowa" )
	private Umowa umowa  = new Umowa();
	
	@XmlElement( name = "Nip" )
	private String nip;
	
	@XmlElement( name = "Regon" )
	private String regon;
	
	@XmlElement( name = "OkresWypowiedzenia" )
	private Boolean okresWypowiedzenia;
	
	@XmlElement( name = "UrlopWychowawczy" )
	private Boolean urlopWychowawczy;
	
	@XmlElement( name = "UrlopWychowawczyData" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date urlopWychowawczyData;
	
	public Oswiadczenie() {
		super( DokumentTyp.OSWIADCZENIE );
	}

	public String getNazwaPracodawcy() {
		return nazwaPracodawcy;
	}

	public void setNazwaPracodawcy(String nazwaPracodawcy) {
		this.nazwaPracodawcy = nazwaPracodawcy;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Telefon getTelefon() {
		return telefon;
	}

	public void setTelefon(Telefon telefon) {
		this.telefon = telefon;
	}

	public Boolean getZgodaNaKontakt() {
		return zgodaNaKontakt;
	}

	public void setZgodaNaKontakt(Boolean zgodaNaKontakt) {
		this.zgodaNaKontakt = zgodaNaKontakt;
	}

	public Umowa getUmowa() {
		return umowa;
	}

	public void setUmowa(Umowa umowa) {
		this.umowa = umowa;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getRegon() {
		return regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public Boolean getOkresWypowiedzenia() {
		return okresWypowiedzenia;
	}

	public void setOkresWypowiedzenia(Boolean okresWypowiedzenia) {
		this.okresWypowiedzenia = okresWypowiedzenia;
	}

	public Boolean getUrlopWychowawczy() {
		return urlopWychowawczy;
	}

	public void setUrlopWychowawczy(Boolean urlopWychowawczy) {
		this.urlopWychowawczy = urlopWychowawczy;
	}

	public Date getUrlopWychowawczyData() {
		return urlopWychowawczyData;
	}

	public void setUrlopWychowawczyData(Date urlopWychowawczyData) {
		this.urlopWychowawczyData = urlopWychowawczyData;
	}
	
	
	
	
	
}
