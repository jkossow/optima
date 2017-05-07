package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.dec.Reason;
import org.kossowski.optima.util.DateFormatterAdapter2;

@XmlRootElement( name = "decision" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Dec2Optima {

	@XmlElement( name = "id" )
	private int id;
	
	@XmlElement( name = "status" )
	private String status;
	
	@XmlElement( name = "reason" )
	private Reason reason;
	
	@XmlElement( name = "statusDateTime" )
	@XmlJavaTypeAdapter( DateFormatterAdapter2.class )
	private Date statusDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
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
		return "Dec2Optima [id=" + id + ", status=" + status + ", reason=" + reason + ", statusDateTime="
				+ statusDateTime + "]";
	}
	
	
	
}
