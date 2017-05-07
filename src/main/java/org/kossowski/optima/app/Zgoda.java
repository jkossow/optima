package org.kossowski.optima.app;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.enums.ZgodaTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlType
@XmlAccessorType( XmlAccessType.FIELD )
public class Zgoda {

	
	@XmlElement( name = "Typ")
	private ZgodaTyp typ;
	
	@XmlElement( name = "Podmiot")
	private String podmiot;
	
	@XmlElement( name = "Data")
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date data;
	
	@XmlElement( name = "Wartosc" )
	private boolean wartosc;

	public Zgoda() {}
	
	public Zgoda( ZgodaTyp typ, boolean wartosc ) {
		this.typ = typ;
		this.wartosc = wartosc;
	}
	
	public Zgoda( int typ ) {
		
	}
	
	public Zgoda(ZgodaTyp typ, String podmiot, Date data, boolean wartosc) {
		super();
		this.typ = typ;
		this.podmiot = podmiot;
		this.data = data;
		this.wartosc = wartosc;
	}

	public ZgodaTyp getTyp() {
		return typ;
	}

	public void setTyp(ZgodaTyp typ) {
		this.typ = typ;
	}

	public String getPodmiot() {
		return podmiot;
	}

	public void setPodmiot(String podmiot) {
		this.podmiot = podmiot;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isWartosc() {
		return wartosc;
	}

	public void setWartosc(boolean wartosc) {
		this.wartosc = wartosc;
	};
	
	

}
