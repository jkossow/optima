package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class WnioskodawcaAppNaglowek {
	
	@XmlAttribute( name = "Id" )
	private Integer id = 1;
	
	@XmlAttribute
	private String pesel;
	
	@XmlAttribute
	private Boolean glowny = true;
	
	@XmlElement( name = "Imie" )
	private String imie;
	
	@XmlElement( name = "Nazwisko" )
	private String nazwisko;
	
	
	@XmlElement( name = "Dokumenty" )
	private IloscDok dokumenty = new IloscDok();



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getPesel() {
		return pesel;
	}



	public void setPesel(String pesel) {
		this.pesel = pesel;
	}



	public Boolean getGlowny() {
		return glowny;
	}



	public void setGlowny(Boolean glowny) {
		this.glowny = glowny;
	}



	public String getImie() {
		return imie;
	}



	public void setImie(String imie) {
		this.imie = imie;
	}



	public String getNazwisko() {
		return nazwisko;
	}



	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}



	public IloscDok getDokumenty() {
		return dokumenty;
	}



	public void setDokumenty(IloscDok dokumenty) {
		this.dokumenty = dokumenty;
	} 
	
	

	
	

}
