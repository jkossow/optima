package org.kossowski.optima.builders;



import java.math.BigDecimal;
import java.util.Date;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.enums.ZrodloInformacjiEnum;

public class AppOptimaFacade{
	
	private AppOptima wniosek;
	
	public AppOptimaFacade( AppOptima wniosek ) {
		this.wniosek = wniosek;
	}
	
	public AppOptima getWniosek() {
		return wniosek;
	};
	
	public void setId( Integer id ) {
		wniosek.getNaglowek().getWniosek().setId(id);
	}
	
	public void setTyp( String typ ) {
		wniosek.getNaglowek().getWniosek().setTyp( typ );
	}
	
	public void setRodzaj( String rodzaj ) {
		wniosek.getNaglowek().getWniosek().setRodzaj(rodzaj);
	};
	
	public void setDataPodpisania( Date data ) {
		wniosek.getNaglowek().getWniosek().setDataPodpisania( data );
	}
	
	public void setMiejscePodpisania( String miejsce ) {
		wniosek.getNaglowek().getWniosek().setMiejscePodpisania( miejsce );
	}
	
	public void setKtoPodpisal( String kto ) {
		wniosek.getNaglowek().getWniosek().setKtoPodpisal( kto );
	}
	
	//id wnioskodawcy ustawione jest na 1
	
	public void setKwota( BigDecimal kwota ) {
		wniosek.getDane().setKwota( kwota );
	}

	public void setOkres( int okres ) {
		wniosek.getDane().setOkres( okres );
	}
	
	public void setZrodloInformacji( ZrodloInformacjiEnum zr ) {
		wniosek.getDane().setZrodloInformacji( zr );
	}
	
	public void setWnioskodawca( WnioskodawcaApp w) {
		wniosek.getNaglowek().getWnioskodawca().setPesel( w.getPesel() );
		wniosek.getNaglowek().getWnioskodawca().setNazwisko( w.getNazwisko() );
		wniosek.getNaglowek().getWnioskodawca().setImie( w.getImie() );
		
		wniosek.getDane().getWnioskodawcy().add( w );
	}
	
	

}
