package org.kossowski.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "rodzaje_dochodu" )
public class RodzajDochodu {
	
	@Id
	private Integer id;
	
	private String nazwa;
	
	private Integer path;

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

	public Integer getPath() {
		return path;
	}

	public void setPath(Integer path) {
		this.path = path;
	}

	
	
	
}
