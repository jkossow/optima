package org.kossowski.optima;


	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.dec.Offer;


@XmlRootElement( name="decision")
@XmlAccessorType( XmlAccessType.FIELD )
public class Dec0Optima {	

		@XmlElement
		private int id;
		
		@XmlElement
		private Date statusDateTime;
		
		//@XmlElement( name="offers")
		@XmlElementWrapper(name = "offers")
		private List<Offer> offer = new ArrayList<Offer>();
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getStatusDateTimel() {
			return statusDateTime;
		}

		public void setStatusDateTime(Date statusDateTimel) {
			this.statusDateTime = statusDateTimel;
		}

		public List<Offer> getOffer() {
			return offer;
		}

		public void setOffer(List<Offer> offer) {
			this.offer = offer;
		}

	

		public Date getStatusDateTime() {
			return statusDateTime;
		}

		@Override
		public String toString() {
			return "Dec0Optima [id=" + id + ", statusDateTime=" + statusDateTime + ", offer=" + offer + "]";
		}

		
		
	
}
