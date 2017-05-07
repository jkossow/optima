package org.kossowski.optima.dec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement( name = "reason" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Reason {
	
	@XmlAttribute
	private String id;
	
	@XmlValue
	private String reason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "Reason [id=" + id + ", reason=" + reason + "]";
	}
	
	

}
