package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.dec.Offer;
import org.kossowski.optima.dec.Reason;


@XmlRootElement( name="decision")
@XmlAccessorType( XmlAccessType.FIELD )
public class DecOptima {
	
	
	@XmlElement( name = "id" )
	private Integer id;
	
	@XmlElement( name = "status" )
	private String status =  null;
	
	@XmlElement( name = "statusDateTime" )
	private Date statusDateTime;
	
	@XmlElement( name="offer" )
	private Offer offer;

	@XmlElement( name = "reason")
	private Reason reason;
	
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

	
	
	
	public Offer getOffers() {
		return offer;
	}

	public void setOffers( Offer offer) {
		this.offer = offer;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "DecOptima [id=" + id + ", status=" + status + ", statusDateTime=" + statusDateTime + ", offer=" + offer
				+ ", reason=" + reason + "]";
	}

	
	
	

	
	
	
	
}
