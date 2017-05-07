package org.kossowski.optima.app;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class MiesieczneDochodyWydatki {

	@XmlElementWrapper( name = "Dochody" )
	@XmlElementRef
	private List<DochodWydatek> dochody = new ArrayList<DochodWydatek>();
	
	@XmlElementWrapper( name = "Wydatki" )
	@XmlElementRef
	private List<DochodWydatek> wydatki = new ArrayList<DochodWydatek>();

	public List<DochodWydatek> getDochody() {
		return dochody;
	}

	public void setDochody(List<DochodWydatek> dochody) {
		this.dochody = dochody;
	}

	public List<DochodWydatek> getWydatki() {
		return wydatki;
	}

	public void setWydatki(List<DochodWydatek> wydatki) {
		this.wydatki = wydatki;
	}
	
	
	public void addDochod( DochodWydatek d ) {
		dochody.add( d );
	}
	
	public void addWydatek( DochodWydatek d ) {
		wydatki.add( d );
	}

	// założenie tylko jeden dochod i tylko jeden wydatek
	public DochodWydatek getDochod() {
		return dochody.get(0);
	}
	
	public void setDochod( DochodWydatek d ) {
		dochody.clear();
		dochody.add( d );
	}
	
	public DochodWydatek getWydatek() {
		return wydatki.get(0);
	}
	
	
	public void setWydatek( DochodWydatek w ) {
		wydatki.clear();
		wydatki.add( w );
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dochody == null) ? 0 : dochody.hashCode());
		result = prime * result + ((wydatki == null) ? 0 : wydatki.hashCode());
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
		MiesieczneDochodyWydatki other = (MiesieczneDochodyWydatki) obj;
		if (dochody == null) {
			if (other.dochody != null)
				return false;
		} else if (!dochody.equals(other.dochody))
			return false;
		if (wydatki == null) {
			if (other.wydatki != null)
				return false;
		} else if (!wydatki.equals(other.wydatki))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MiesieczneDochodyWydatki [dochody=" + dochody + ", wydatki=" + wydatki + "]";
	}
	
	
	
}
