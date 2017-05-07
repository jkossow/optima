package org.kossowski.optima;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.app.PosrednictwoFactor;

@XmlRootElement(name="document")
@XmlAccessorType( XmlAccessType.FIELD )
public class FactorAppOptima  extends AppOptima {

	public FactorAppOptima() {
		super();
		getNaglowek().getWniosek().setPosrednictwo( new PosrednictwoFactor() );
	}
	
	public static AppOptima getNewPrescoring() {
		AppOptima app = new FactorAppOptima();
		app.getNaglowek().getWniosek().setTyp( "Prescoring" );
		app.getNaglowek().getWniosek().setRodzaj( "Nowy" );
		
		return app;
	}
	
	public static AppOptima getNew() {
	
		AppOptima app = new FactorAppOptima();
		app.getNaglowek().getWniosek().setRodzaj( "Nowy" );
		
		return app;
	}
	
}
