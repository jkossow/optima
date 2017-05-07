package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "path3")
public class Path3 extends Path {

		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@Column( name = "id_wniosku" )
		private Integer idWniosku;
		
		@Column( name = "id_wnioskodawcy" )
		private Integer idWnioskodawcy;
		
		
		//działalność gospodarcza
		
		
		@Column( name = "optima_czy_zeskanowany")
		private Boolean czyZeskanowany;
		
		@Column( name = "optima_dodatkowe_informacje")
		private String dodatkoweInformacje;
		
		public Integer getId() {
			return id;
		}

		
		
		
		
		
		
		public Integer getIdWniosku() {
			return idWniosku;
		}







		public void setIdWniosku(Integer idWniosku) {
			this.idWniosku = idWniosku;
		}







		public Integer getIdWnioskodawcy() {
			return idWnioskodawcy;
		}







		public void setIdWnioskodawcy(Integer idWnioskodawcy) {
			this.idWnioskodawcy = idWnioskodawcy;
		}







		public Boolean getCzyZeskanowany() {
			return czyZeskanowany;
		}







		public void setCzyZeskanowany(Boolean czyZeskanowany) {
			this.czyZeskanowany = czyZeskanowany;
		}







		public String getDodatkoweInformacje() {
			return dodatkoweInformacje;
		}







		public void setDodatkoweInformacje(String dodatkoweInformacje) {
			this.dodatkoweInformacje = dodatkoweInformacje;
		}







		public void setId(Integer id) {
			this.id = id;
		}







		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Path3 other = (Path3) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Path3 [id=" + id + ", idWniosku=" + idWniosku + ", idWnioskodawcy=" + idWnioskodawcy
					+ ", czyZeskanowany=" + czyZeskanowany + ", dodatkoweInformacje=" + dodatkoweInformacje + "]";
		}

		
		
		
		
		
		
}
