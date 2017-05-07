package org.kossowski.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class OswiadczenieWarunkiObslugiFactorDB {

	@Column( name = "optima_oswiadcz_warunki_obslugi_klient_zapoznany" )
	private Boolean klientZapoznany;
	
	
	@Column( name = "optima_oswiadcz_warunki_obslugi_data" )
	@Temporal( TemporalType.DATE )
	private Date data;

	@Column( name = "optima_oswiadcz_warunki_obslugi_dummy")
	private int dummy = 1;

	public Boolean getKlientZapoznany() {
		return klientZapoznany;
	}


	public void setKlientZapoznany(Boolean klientZapoznany) {
		this.klientZapoznany = klientZapoznany;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
