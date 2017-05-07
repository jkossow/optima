package org.kossowski.optima.cnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class CancelReason {

	@XmlAttribute( name = "id" )
	private int id;
	
	@XmlValue
	private String reason;
	
	public CancelReason() {};
	
	public CancelReason( int id, String reason ) {
		this.id = id;
		this.reason = reason;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "CancelReason [id=" + id + ", reason=" + reason + "]";
	}

	
	
	
	
	
}
