package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class PosrednictwoApp {

	@XmlAttribute( name = "Id" )
	private String id;
	
	@XmlAttribute( name = "PlacowkaId" )
	private String placowkaId;
	
	@XmlAttribute( name = "PracownikId" )
	private String pracownikId;
	
	@XmlValue
	private String nazwa;

	
	public PosrednictwoApp() {};
	
	public PosrednictwoApp(String id, String placowkaId, String pracownikId, String nazwa) {
		super();
		this.id = id;
		this.placowkaId = placowkaId;
		this.pracownikId = pracownikId;
		this.nazwa = nazwa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlacowkaId() {
		return placowkaId;
	}

	public void setPlacowkaId(String placowkaId) {
		this.placowkaId = placowkaId;
	}

	public String getPracownikId() {
		return pracownikId;
	}

	public void setPracownikId(String pracownikId) {
		this.pracownikId = pracownikId;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
	
}
