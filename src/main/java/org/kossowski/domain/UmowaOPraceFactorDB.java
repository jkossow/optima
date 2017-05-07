package org.kossowski.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.kossowski.optima.enums.Etat;
import org.kossowski.optima.enums.UmowaTyp;


public class UmowaOPraceFactorDB {
	
	@Column( name = "optima_umowa_typ")
	@Enumerated( EnumType.STRING )
	private UmowaTyp typ;
	
	@Column( name = "optima_umowa_data_od")
	@Temporal( TemporalType.DATE)
	private Date dataOd;
	
	@Column( name = "optima_umowa_data_do")
	@Temporal( TemporalType.DATE)
	private Date dataDo;
	
	@Column( name = "optima_umowa_etat")
	@Enumerated( EnumType.STRING )
	private Etat etat;
	
	@Column( name = "optima_umowa_stanowisko")
	private String stanowisko;

	public UmowaTyp getTyp() {
		return typ;
	}

	public void setTyp(UmowaTyp typ) {
		this.typ = typ;
	}

	public Date getDataOd() {
		return dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataDo() {
		return dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	
	
}
