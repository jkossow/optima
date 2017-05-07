package org.kossowski.optima.app.dokumenty;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Adres;
import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.Umowa;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.enums.OkresNaliczeniaKwotyBrutto;
import org.kossowski.optima.enums.TakNie;
import org.kossowski.optima.util.DateFormatterAdapter;


@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class ZaswiadczenieZp extends Dokument {

	@XmlElement( name = "KwotaBrutto" )
	private BigDecimal kwotaBrutto;
	
	@XmlElement( name = "KwotaNetto" )
	private BigDecimal kwotaNetto;
	
	@XmlElement( name = "Znak" )
	private String znak;
	
	@XmlElement( name = "DataWystawienia" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date dataWystawienia;
	
	@XmlElement( name = "Umowa" )
	private Umowa umowa;
	
	@XmlElement( name = "OkresNaliczeniaKwotyBrutto" )
	private OkresNaliczeniaKwotyBrutto okresNaliczeniaKwotyBrutto;
	
	@XmlElement( name = "ObciazenieKomornicze" )
	private TakNie obciazenieKomornicze;
	
	@XmlElement( name = "Alimenty" )
	private TakNie alimenty;
	
	@XmlElement( name = "Wystawil" )
	private String wystawil;
	
	@XmlElement( name = "NazwaPracodawcy" )
	private String nazwaPracodawcy;
	
	@XmlElement( name = "Adres" )
	private Adres adres;
	
	@XmlElement( name = "Telefon" )
	private String telefon;
	
	@XmlElement( name = "Nip" )
	private String nip;
	
	@XmlElement( name = "Regon" )
	private String regon;
	
	@XmlElement( name = "ZgodaNaKontakt" )
	private Boolean zgodaNaKontrakt;
	
	
	
	
	public ZaswiadczenieZp() {
		super( DokumentTyp.ZASWIADCZENIE_ZP );
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




	public String getZnak() {
		return znak;
	}




	public void setZnak(String znak) {
		this.znak = znak;
	}




	public Date getDataWystawienia() {
		return dataWystawienia;
	}




	public void setDataWystawienia(Date dataWystawienia) {
		this.dataWystawienia = dataWystawienia;
	}




	public Umowa getUmowa() {
		return umowa;
	}




	public void setUmowa(Umowa umowa) {
		this.umowa = umowa;
	}




	public OkresNaliczeniaKwotyBrutto getOkresNaliczeniaKwotyBrutto() {
		return okresNaliczeniaKwotyBrutto;
	}




	public void setOkresNaliczeniaKwotyBrutto(OkresNaliczeniaKwotyBrutto okresNaliczeniaKwotyBrutto) {
		this.okresNaliczeniaKwotyBrutto = okresNaliczeniaKwotyBrutto;
	}




	public TakNie getObciazenieKomornicze() {
		return obciazenieKomornicze;
	}




	public void setObciazenieKomornicze(TakNie obciazenieKomornicze) {
		this.obciazenieKomornicze = obciazenieKomornicze;
	}




	public TakNie getAlimenty() {
		return alimenty;
	}




	public void setAlimenty(TakNie alimenty) {
		this.alimenty = alimenty;
	}




	public String getWystawil() {
		return wystawil;
	}




	public void setWystawil(String wystawil) {
		this.wystawil = wystawil;
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




	public String getTelefon() {
		return telefon;
	}




	public void setTelefon(String telefon) {
		this.telefon = telefon;
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




	public Boolean isZgodaNaKontrakt() {
		return zgodaNaKontrakt;
	}




	public void setZgodaNaKontrakt(Boolean zgodaNaKontrakt) {
		this.zgodaNaKontrakt = zgodaNaKontrakt;
	}
	
	
	
	
}
