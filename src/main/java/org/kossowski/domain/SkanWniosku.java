package org.kossowski.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "wnioski_skany_bank_pliki")
public class SkanWniosku {

	@Id
	private Long id;
	
	@Column( name = "wniosek_id" )
	private Long wniosekId;
	
	@Column( name = "bank_id" )
	private Integer bankId;
	
	@Column( name = "dokument_id" )
	private Long dokumentId;
	
	@Column( name = "nazwa_pliku" )
	private String nazwaPliku;
}
