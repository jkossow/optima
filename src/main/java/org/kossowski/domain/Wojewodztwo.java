package org.kossowski.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "wojewodztwa" )
@Entity
public class Wojewodztwo {

	@Id
	@Column( name = "id")
	private Integer id;
	
	@Column( name = "nazwa" )
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
