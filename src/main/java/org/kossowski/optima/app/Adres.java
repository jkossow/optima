package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD)
public class Adres {
	
	@XmlElement( name = "Ulica" )
	private String ulica;
	
	@XmlElement( name = "NrDomu" )
	private String nrDomu;
	
	@XmlElement( name = "NrLokalu" )
	private String nrLokalu;
	
	@XmlElement( name = "Kod" )
	private String kod;
	
	@XmlElement( name = "Miejscowosc" )
	private String miejscowosc;
	
	public Adres() {};
	
	public Adres( String ulica, String nrDomu, String nrLokalu, String kod, String miejscowosc ) {
		this.ulica = ulica;
		this.nrDomu = nrDomu;
		this.nrLokalu = nrLokalu;
		this.kod = kod;
		this.miejscowosc = miejscowosc;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNrDomu() {
		return nrDomu;
	}

	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}

	public String getNrLokalu() {
		return nrLokalu;
	}

	public void setNrLokalu(String nrLokalu) {
		this.nrLokalu = nrLokalu;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	
	
}
