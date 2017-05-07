package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.enums.CzasPosiadaniaRachunkuBankowego;



@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class RachunekBankowy {

	@XmlElement( name = "NrRachunku" )
	private String nrRachunku;
	
	@XmlElement( name = "NazwaBanku" )
	private String nazwaBanku;
	
	@XmlElement( name = "ZgodaNadplata" )
	private Boolean zgodaNadplata;
	
	@XmlElement( name = "CzasPosiadaniaRachunkuBankowego" )
	private CzasPosiadaniaRachunkuBankowego czasPosiadaniaRachunku;
	
	public RachunekBankowy() {}

	public RachunekBankowy(String nrRachunku, String nazwaBanku, Boolean zgodaNadplata,
			CzasPosiadaniaRachunkuBankowego czasPosiadaniaRachunku) {
		super();
		this.nrRachunku = nrRachunku;
		this.nazwaBanku = nazwaBanku;
		this.zgodaNadplata = zgodaNadplata;
		this.czasPosiadaniaRachunku = czasPosiadaniaRachunku;
	}

	public String getNrRachunku() {
		return nrRachunku;
	}

	public void setNrRachunku(String nrRachunku) {
		this.nrRachunku = nrRachunku;
	}

	public String getNazwaBanku() {
		return nazwaBanku;
	}

	public void setNazwaBanku(String nazwaBanku) {
		this.nazwaBanku = nazwaBanku;
	}

	public Boolean getZgodaNadplata() {
		return zgodaNadplata;
	}

	public void setZgodaNadplata(Boolean zgodaNadplata) {
		this.zgodaNadplata = zgodaNadplata;
	}

	public CzasPosiadaniaRachunkuBankowego getCzasPosiadaniaRachunku() {
		return czasPosiadaniaRachunku;
	}

	public void setCzasPosiadaniaRachunku(CzasPosiadaniaRachunkuBankowego czasPosiadaniaRachunku) {
		this.czasPosiadaniaRachunku = czasPosiadaniaRachunku;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((czasPosiadaniaRachunku == null) ? 0 : czasPosiadaniaRachunku.hashCode());
		result = prime * result + ((nazwaBanku == null) ? 0 : nazwaBanku.hashCode());
		result = prime * result + ((nrRachunku == null) ? 0 : nrRachunku.hashCode());
		result = prime * result + ((zgodaNadplata == null) ? 0 : zgodaNadplata.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RachunekBankowy other = (RachunekBankowy) obj;
		if (czasPosiadaniaRachunku != other.czasPosiadaniaRachunku)
			return false;
		if (nazwaBanku == null) {
			if (other.nazwaBanku != null)
				return false;
		} else if (!nazwaBanku.equals(other.nazwaBanku))
			return false;
		if (nrRachunku == null) {
			if (other.nrRachunku != null)
				return false;
		} else if (!nrRachunku.equals(other.nrRachunku))
			return false;
		if (zgodaNadplata == null) {
			if (other.zgodaNadplata != null)
				return false;
		} else if (!zgodaNadplata.equals(other.zgodaNadplata))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RachunekBankowy [nrRachunku=" + nrRachunku + ", nazwaBanku=" + nazwaBanku + ", zgodaNadplata="
				+ zgodaNadplata + ", czasPosiadaniaRachunku=" + czasPosiadaniaRachunku + "]";
	}

	
	
	
	
	
}
