package org.kossowski.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AdresZameldowaniaFactorDB {

	
	
	
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
	
	@Column( name = "meldunek_czasowy" )
	private Boolean meldunekCzasowy;
	
	@Column( name = "meldunek_czasowy_do" )
	@Temporal( TemporalType.DATE )
	private Date meldunekCzasowyDo;

	@Column( name = "optima_adres_zamel_dummy")
	private int dummy = 1;
	
	public AdresZameldowaniaFactorDB() {};
	
	
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
