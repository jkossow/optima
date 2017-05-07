package org.kossowski.optima;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.util.DateFormatterAdapter2;

@XmlRootElement( name = "loanGo" )
@XmlAccessorType( XmlAccessType.FIELD )
public class GoOptima {
	
	@XmlElement( name = "id")
	private Integer id;
	
	@XmlElement( name = "status")
	private String status;
	
	@XmlElement( name = "reason" )
	private String reason;
	
	@XmlElement( name = "statusDateTime")
	@XmlJavaTypeAdapter( DateFormatterAdapter2.class)
	private Date statusDateTime;
	
	@XmlElement( name = "verified")
	private Boolean verified;
	
	@XmlElement( name ="amountToClose" )
	private BigDecimal amountToClose;

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

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public BigDecimal getAmountToClose() {
		return amountToClose;
	}

	public void setAmountToClose(BigDecimal amountToClose) {
		this.amountToClose = amountToClose;
	}

	@Override
	public String toString() {
		return "GoOptima [id=" + id + ", status=" + status + ", reason=" + reason + ", statusDateTime=" + statusDateTime
				+ ", verified=" + verified + ", amountToClose=" + amountToClose + "]";
	}
	
	
	

}
