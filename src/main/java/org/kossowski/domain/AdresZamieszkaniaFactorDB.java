package org.kossowski.domain;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;

public class AdresZamieszkaniaFactorDB {

	
	@Column( name = "ul")
	private String ulica;
	
	@Column( name = "ul_nr_1")
	private String nrDomu;
	
	@Column( name = "ul_nr_2" )
	private String nrLokalu;
	
	@Column( name = "kod_poczt" )
	private String kodPocztowy;
	
	@Column( name = "miejscowosc" )
	private String miejscowosc;
	
	@Column( name = "czas_zamieszkania_pod_adresem")
	@Enumerated( EnumType.STRING )
	private CzasZamieszkaniaPodAdresem czasZamieszkaniaPodAdresem;
	
	
	public AdresZamieszkaniaFactorDB() {};

	public AdresZamieszkaniaFactorDB( AdresZamieszkania adres ) {
		this.ulica = adres.getUlica();
		this.nrDomu = adres.getNrDomu();
		this.nrLokalu = adres.getNrLokalu();
		this.kodPocztowy = adres.getKod();
		this.miejscowosc = adres.getMiejscowosc();
		this.czasZamieszkaniaPodAdresem = adres.getCzasZamieszkaniaPodAdresem();
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

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public CzasZamieszkaniaPodAdresem getCzasZamieszkaniaPodAdresem() {
		return czasZamieszkaniaPodAdresem;
	}

	public void setCzasZamieszkaniaPodAdresem(CzasZamieszkaniaPodAdresem czasZamieszkaniaPodAdresem) {
		this.czasZamieszkaniaPodAdresem = czasZamieszkaniaPodAdresem;
	}
	
	
	@Transient
	private int dummy;
	
}
