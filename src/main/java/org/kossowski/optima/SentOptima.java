package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.util.DateFormatterAdapter2;

@XmlRootElement( name = "loanSent" )
@XmlAccessorType( XmlAccessType.FIELD )
public class SentOptima {

	@XmlElement( name = "id" )
	private Integer id;
	
	@XmlElement( name = "status" )
	private String status;
	
	@XmlElement( name = "statusDateTime" )
	@XmlJavaTypeAdapter( DateFormatterAdapter2.class )
	private Date statusDateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	@Override
	public String toString() {
		return "SentOptima [id=" + id + ", status=" + status + ", statusDateTime=" + statusDateTime + "]";
	}
	
	
	
}
