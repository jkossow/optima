package org.kossowski.integration.transformers;


import java.util.Date;

import org.kossowski.optima.RunOptima;
import org.kossowski.optima.run.FileRelatedTo;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class RunTransformer {
	
	public RunOptima toOptima( Object o, MessageHeaders headers ) {
		
		
		return sampleRunOptima();
	}
	
	public RunOptima sampleRunOptima() {
		RunOptima r = new RunOptima();
		
		r.setId( 1033 );
		r.setStatusDateTime( new Date() );
		r.setScansFile( "SCAN_1033.zip" );
		r.setDateOfSignature( new Date() );
		r.setPlace("Radomsko");
		r.setPerson("Janusz Kossowski");
		r.setGiro( 1 );
		
		r.addFile( FileRelatedTo.DOWOD_OSOBISTY , "dowod.jpg" );
		r.addFile( FileRelatedTo.MEDIA, "rach za media.jpg" );
		r.addFile( FileRelatedTo.RMUA, "rmua.jpg" );
		r.addFile( FileRelatedTo.ZASW_ZUS, "zaswiadczenie_zud.jpg" );
		r.addFile( FileRelatedTo.EMERYTURA, "emer.jpg" );
		r.addFile( FileRelatedTo.RENTA, "renta.jpg" );
		r.addFile( FileRelatedTo.DECYZJA, "dec.jpg" );
		r.addFile( FileRelatedTo.PASEK, "pasek.jpg" );
		r.addFile( FileRelatedTo.SWIADCZ_PRZEDEMERYT, "sw_przed.jpg" ); 
		r.addFile( FileRelatedTo.ZASW_ZP, "zasw_praca.jpg" );
		r.addFile( FileRelatedTo.WYCIAG_BANK, "wyc.jpg" );
		r.addFile( FileRelatedTo.OSWIADCZENIE, "osw.jpg" ); 
		
		return r;
	}

}
