package org.kossowski.optima;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "err")
@XmlAccessorType( XmlAccessType.FIELD )
public class ErrOptima {
	
	@XmlAttribute( name = "id" )
	private Integer id;
	
	@XmlElement( name = "message" )
	private String message;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrOptima [id=" + id + ", message=" + message + "]";
	}

	
	
}
