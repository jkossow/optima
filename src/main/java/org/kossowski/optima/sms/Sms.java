package org.kossowski.optima.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class Sms {
	
	// identyfikator wniosku;
	@XmlElement( name = "wniosek" )
	private Integer wniosek;

	public Integer getWniosek() {
		return wniosek;
	}

	public void setWniosek(Integer wniosek) {
		this.wniosek = wniosek;
	}

	@Override
	public String toString() {
		return "Sms [wniosek=" + wniosek + "]";
	}

	
	
	
	
}
