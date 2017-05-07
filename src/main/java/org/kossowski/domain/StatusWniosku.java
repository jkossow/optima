package org.kossowski.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StatusWniosku {

	@Id
	private Integer id;
	
	private String nazwa;
	
	private Integer gotowka;
	
	
	public Integer getId() {
		return id;
	}


	public String getNazwa() {
		return nazwa;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public Integer getGotowka() {
		return gotowka;
	}


	public void setGotowka(Integer gotowka) {
		this.gotowka = gotowka;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "StatusWniosku [id=" + id + ", nazwa=" + nazwa + ", gotowka=" + gotowka + "]";
	}
	
	
	
	
}
