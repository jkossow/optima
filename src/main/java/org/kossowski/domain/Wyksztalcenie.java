package org.kossowski.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "wyksztalcenie" )
@Entity
public class Wyksztalcenie {
	
		@Id
		private Integer id;
		
		private String nazwa;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNazwa() {
			return nazwa;
		}

		public void setNazwa(String nazwa) {
			this.nazwa = nazwa;
		}
	
		
		
		
}
