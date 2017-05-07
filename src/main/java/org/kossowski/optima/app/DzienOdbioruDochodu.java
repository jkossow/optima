package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD)
public class DzienOdbioruDochodu {
	
	@XmlValue
	private int dzien;

	public DzienOdbioruDochodu() {};
	
	public DzienOdbioruDochodu( int dzien ) {
		this.dzien = dzien;
	}

	public int getDzien() {
		return dzien;
	}

	public void setDzien(int dzien) {
		this.dzien = dzien;
	}
	
	
	
}
