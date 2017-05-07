package org.kossowski.optima.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.enums.ZrodloInformacjiEnum;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class DaneApp {
	
	@XmlElement( name = "Kwota")
	private BigDecimal kwota = new BigDecimal(0);
	
	@XmlElement( name = "Okres" )
	private Integer okres = new Integer(0);
	
	@XmlElement( name = "ZrodloInformacji" )
	private ZrodloInformacjiEnum zrodloInformacji;
	
	@XmlElementWrapper( name="Wnioskodawcy" )
	@XmlElement( name = "Wnioskodawca" )
	private List<WnioskodawcaApp> wnioskodawcy = new ArrayList<WnioskodawcaApp>();

	
	public WnioskodawcaApp getWnioskodawca() {
		return wnioskodawcy.get(0);
	}
	
	// zalozenie - jeden wnioskodawca
	public void setWniodkodawca( WnioskodawcaApp w ) {
		wnioskodawcy.clear();
		wnioskodawcy.add( w );
	}
	
	public void addWnioskodawcaApp( WnioskodawcaApp w) {
		wnioskodawcy.add( w );
	}
	
	
	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public int getOkres() {
		return okres;
	}

	public void setOkres(int okres) {
		this.okres = okres;
	}

	public ZrodloInformacjiEnum getZrodloInformacji() {
		return zrodloInformacji;
	}

	public void setZrodloInformacji(ZrodloInformacjiEnum zrodloInformacji) {
		this.zrodloInformacji = zrodloInformacji;
	}

	public List<WnioskodawcaApp> getWnioskodawcy() {
		return wnioskodawcy;
	}

	public void setWnioskodawcy(List<WnioskodawcaApp> wnioskodawcy) {
		this.wnioskodawcy = wnioskodawcy;
	}
	
	
	
	
	

}
