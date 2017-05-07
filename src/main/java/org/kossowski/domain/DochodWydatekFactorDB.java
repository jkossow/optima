package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DochodWydatekFactorDB {

	@Column( name =  "rodzaj_dochodu") //pole instnieje
	private Integer typ;
	
	@Column( name = "optima_dochod_opis")
	private String opis;
	
	@Column( name = "dochod", columnDefinition = "text") //tak - bo pole istnieje 
	private BigDecimal kwotaNetto;
	
	@Column( name = "optima_dochod_kwota_brutto")
	private BigDecimal kwotaBrutto;
	
	@Column( name = "optima_dochod_kwota")
	private BigDecimal kwota;
	
	@Column( name = "optima_dochod_okres_od")
	@Temporal( TemporalType.DATE )
	private Date okresOd;
	
	@Column( name = "optima_dochod_okres_do")
	@Temporal( TemporalType.DATE )
	private Date okresDo;
	
	@Column( name ="optima_dochod_bezterminowo" )
	private Boolean bezterminowo;

	public Integer getTyp() {
		return typ;
	}

	public void setTyp(Integer typ) {
		this.typ = typ;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public BigDecimal getKwotaNetto() {
		return kwotaNetto;
	}

	public void setKwotaNetto(BigDecimal kwotaNetto) {
		this.kwotaNetto = kwotaNetto;
	}

	public BigDecimal getKwotaBrutto() {
		return kwotaBrutto;
	}

	public void setKwotaBrutto(BigDecimal kwotaBrutto) {
		this.kwotaBrutto = kwotaBrutto;
	}

	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public Date getOkresOd() {
		return okresOd;
	}

	public void setOkresOd(Date okresOd) {
		this.okresOd = okresOd;
	}

	public Date getOkresDo() {
		return okresDo;
	}

	public void setOkresDo(Date okresDo) {
		this.okresDo = okresDo;
	}

	public Boolean getBezterminowo() {
		return bezterminowo;
	}

	public void setBezterminowo(Boolean bezterminowo) {
		this.bezterminowo = bezterminowo;
	}

	@Override
	public String toString() {
		return "DochodWydatekFactorDB [typ=" + typ + ", opis=" + opis + ", kwotaNetto=" + kwotaNetto + ", kwotaBrutto="
				+ kwotaBrutto + ", kwota=" + kwota + ", okresOd=" + okresOd + ", okresDo=" + okresDo + ", bezterminowo="
				+ bezterminowo + "]";
	}
	
	
	
	
}
