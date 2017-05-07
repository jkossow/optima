package org.kossowski.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AdresFactorDB {

	@Column( name = "optima_adres_ulica")
	private String ulica;
	
	@Column( name = "optima_adres_nr_domu")
	private String  nrDomu;
	
	@Column( name = "optima_adres_nr_lokalu")
	private String nrLokalu;
	
	@Column( name = "optima_adres_kod_pocztowy")
	private String kodPocztowy;
	
	@Column( name = "optima_adres_miejscowosc")
	private String miejscowosc;
	
	@Column( name = "optima_adres_dummy")
	private int dummy = 1;
	
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
	
	
	
	
	
}
