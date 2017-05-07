package org.kossowski.optima.app.dokumenty;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.enums.DecyzjaDotyczy;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class ZaswiadczenieZus extends Dokument {

	@XmlElement( name = "ZaMiesiac" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date zaMiesiac;
	
	@XmlElement( name = "Znak" )
	private String znak;
	
	@XmlElement( name = "KwotaBrutto")
	private BigDecimal kwotaBrutto;
	
	@XmlElement( name = "KwotaNetto")
	private BigDecimal kwotaNetto;
	
	@XmlElement( name = "PrzyslugujeDo")
	private Date przyslugujeDo;
	
	@XmlElement( name = "RentaRodzinna")
	private Boolean rentaRodzinna;
	
	@XmlElement( name = "RentaRodzinnaNaOsob")
	private Integer rentaRodzinnaOaOsob;
	
	@XmlElement( name = "DecyzjaDotyczy")
	private DecyzjaDotyczy decyzjaDotyczy;
	
	@XmlElement( name = "Data")
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date data;
	
	
	public ZaswiadczenieZus() {
		super( DokumentTyp.ZASWIADCZENIE_ZUS );
	}


	public Date getZaMiesiac() {
		return zaMiesiac;
	}


	public void setZaMiesiac(Date zaMiesiac) {
		this.zaMiesiac = zaMiesiac;
	}


	public String getZnak() {
		return znak;
	}


	public void setZnak(String znak) {
		this.znak = znak;
	}


	public BigDecimal getKwotaBrutto() {
		return kwotaBrutto;
	}


	public void setKwotaBrutto(BigDecimal kwotaBrutto) {
		this.kwotaBrutto = kwotaBrutto;
	}


	public BigDecimal getKwotaNetto() {
		return kwotaNetto;
	}


	public void setKwotaNetto(BigDecimal kwotaNetto) {
		this.kwotaNetto = kwotaNetto;
	}


	public Date getPrzyslugujeDo() {
		return przyslugujeDo;
	}


	public void setPrzyslugujeDo(Date przyslugujeDo) {
		this.przyslugujeDo = przyslugujeDo;
	}


	public Boolean getRentaRodzinna() {
		return rentaRodzinna;
	}


	public void setRentaRodzinna(Boolean rentaRodzinna) {
		this.rentaRodzinna = rentaRodzinna;
	}


	public Integer getRentaRodzinnaOaOsob() {
		return rentaRodzinnaOaOsob;
	}


	public void setRentaRodzinnaOaOsob(Integer rentaRodzinnaOaOsob) {
		this.rentaRodzinnaOaOsob = rentaRodzinnaOaOsob;
	}


	public DecyzjaDotyczy getDecyzjaDotyczy() {
		return decyzjaDotyczy;
	}


	public void setDecyzjaDotyczy(DecyzjaDotyczy decyzjaDotyczy) {
		this.decyzjaDotyczy = decyzjaDotyczy;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}

	
	
	
}
