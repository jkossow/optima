package org.kossowski.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="banki" )
public class Bank {
	
	public static Integer OPTIMA = new Integer( 93 );
	
	@Id 
	private Integer id;

}
