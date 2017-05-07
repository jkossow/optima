package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "waiting")
@XmlAccessorType( XmlAccessType.FIELD )
public class ExpOptima {
	
	@XmlElement( name = "id" )
	private Integer id;
	
	@XmlElement( name = "reason" )
	private String reason;
	
	@XmlElement( name = "statusDateTime")
	private Date statusDateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	@Override
	public String toString() {
		return "ExpOptima [id=" + id + ", reason=" + reason + ", statusDateTime=" + statusDateTime + "]";
	}
	
	
	
	
}
