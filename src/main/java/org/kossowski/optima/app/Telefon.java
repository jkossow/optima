package org.kossowski.optima.app;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class  Telefon implements Serializable {

	@XmlAttribute( name = "Id" )
	private int id;
	
	@XmlAttribute
	private boolean komorka;
	
	@XmlValue
	private String numer;

	public Telefon() {};
	
	public Telefon( String numer, boolean komorka ) {
		this.komorka = komorka;
		this.numer = numer;
	}
	
	public Telefon( int id, String numer, boolean komorka ) {
		this.id = id;
		this.komorka = komorka;
		this.numer = numer;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getKomorka() {
		return komorka;
	}

	public void setKomorka(boolean komorka) {
		this.komorka = komorka;
	}

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}
	
	
	
	
}
