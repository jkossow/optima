package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.cnc.CancelReason;

@XmlRootElement( name = "cancelLoan")
@XmlAccessorType( XmlAccessType.FIELD )
public class CncOptima {
	
	@XmlElement( name = "id" )
	private Integer id;
	
	@XmlElement( name = "cancelDateTime" )
	private Date cancelDateTime;
	
	@XmlElement( name = "cancelReason" )
	private CancelReason cancelReason = new CancelReason();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCancelDateTime() {
		return cancelDateTime;
	}

	public void setCancelDateTime(Date cancelDateTime) {
		this.cancelDateTime = cancelDateTime;
	}

	public CancelReason getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(CancelReason cancelReason) {
		this.cancelReason = cancelReason;
	}
	
	public void setCancelReason( int id, String reason ) {
		this.cancelReason = new CancelReason( id, reason );
	}

	@Override
	public String toString() {
		return "CncOptima [id=" + id + ", cancelDateTime=" + cancelDateTime + ", cancelReason=" + cancelReason + "]";
	}
	
	

}
