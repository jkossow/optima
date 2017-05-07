package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class PrzelewFactorDB {
	
	@Column( name = "optima_przelew_data")
	@Temporal( TemporalType.DATE)
	private Date data;
	
	@Column( name = "optima_przelew_kwota")
	private BigDecimal kwota;
	
	@Column( name = "optima_przelew_tytul")
	private String tytul;

	@Column( name = "optima_przelew_dummy")
	private int dummy = 1;
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	
	
	
	
	
	
}
