package org.kossowski.optima.app;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class Przelew {
	
	@XmlAttribute( name = "id" )
	private int id;
	
	@XmlElement( name = "Data" )
	private Date data;
	
	@XmlElement( name = "Kwota" )
	private BigDecimal kwota;
	
	@XmlElement( name = "Tytul" )
	private String tytul;

	public Przelew(){};
	
	public Przelew(int id, Date data, BigDecimal kwota, String tytul) {
		super();
		this.id = id;
		this.data = data;
		this.kwota = kwota;
		this.tytul = tytul;
	}

	public Przelew(Date data, BigDecimal kwota, String tytul) {
		super();
		this.data = data;
		this.kwota = kwota;
		this.tytul = tytul;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	
	
	
	
	
}
