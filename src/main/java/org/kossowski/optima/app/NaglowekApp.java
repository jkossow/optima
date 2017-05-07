package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class NaglowekApp {
	
	@XmlElement( name = "wniosek" )
	private WniosekApp wniosek = new WniosekApp();
	
	@XmlElement( name = "Wnioskodawca" )
	private WnioskodawcaAppNaglowek wnioskodawca = new WnioskodawcaAppNaglowek();
	
	
	
	public WniosekApp getWniosek() {
		return wniosek;
	}
	
	public void setWniosek(WniosekApp wniosek) {
		this.wniosek = wniosek;
	}

	public WnioskodawcaAppNaglowek getWnioskodawca() {
		return wnioskodawca;
	}

	public void setWnioskodawca(WnioskodawcaAppNaglowek wnioskodawca) {
		this.wnioskodawca = wnioskodawca;
	}
	
	
	
	
	

}
