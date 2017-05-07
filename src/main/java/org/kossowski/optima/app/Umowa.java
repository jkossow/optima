package org.kossowski.optima.app;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.enums.Etat;
import org.kossowski.optima.enums.UmowaTyp;


@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class Umowa {

	@XmlElement( name = "Typ" )
	private UmowaTyp typ;
	
	@XmlElement( name = "Od" )
	private Date dataOd;
	
	@XmlElement( name = "Do" )
	private Date dataDo;
	
	@XmlElement( name ="Etat" )
	private Etat etat;
	
	@XmlElement( name = "Stanowisko" )
	private String stanowisko;

	public UmowaTyp getTyp() {
		return typ;
	}

	public void setTyp(UmowaTyp typ) {
		this.typ = typ;
	}

	public Date getDataOd() {
		return dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataDo() {
		return dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}
	
	
	
	
}
