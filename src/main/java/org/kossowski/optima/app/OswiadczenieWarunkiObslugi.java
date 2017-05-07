package org.kossowski.optima.app;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class OswiadczenieWarunkiObslugi {
	
	@XmlElement( name = "KlientZapoznany" )
	private Boolean klientZapoznany;
	
	@XmlElement( name = "Data" )
	private Date data;

	public OswiadczenieWarunkiObslugi() {
		super();
	}

	public OswiadczenieWarunkiObslugi( Boolean klientZapoznany, Date data) {
		super();
		this.klientZapoznany = klientZapoznany;
		this.data = data;
	}

	
	
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((klientZapoznany == null) ? 0 : klientZapoznany.hashCode());
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
		OswiadczenieWarunkiObslugi other = (OswiadczenieWarunkiObslugi) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (klientZapoznany == null) {
			if (other.klientZapoznany != null)
				return false;
		} else if (!klientZapoznany.equals(other.klientZapoznany))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OswiadczenieWarunkiObslugi [klientZapoznany=" + klientZapoznany + ", data=" + data + "]";
	}
	
	
	

}
