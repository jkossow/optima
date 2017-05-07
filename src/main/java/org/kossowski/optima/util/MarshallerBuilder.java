package org.kossowski.optima.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.AdresApp;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.PosrednictwoApp;
import org.kossowski.optima.app.PosrednictwoFactor;

public class MarshallerBuilder {
	
	protected JAXBContext jc;
	
	public MarshallerBuilder()  throws Exception {
		this.jc = JAXBContext.newInstance(
				FactorAppOptima.class,
				AppOptima.class, 
				AdresApp.class,
				AdresZamieszkania.class, 
				AdresMeldunkowy.class,
				PosrednictwoApp.class,
				PosrednictwoFactor.class,
				org.kossowski.optima.app.dokumenty.Decyzja.class,
				org.kossowski.optima.app.dokumenty.DzialalnoscGospodarcza.class,
				org.kossowski.optima.app.dokumenty.Inne.class,
				org.kossowski.optima.app.dokumenty.Odcinek.class,
				org.kossowski.optima.app.dokumenty.Oswiadczenie.class,
				org.kossowski.optima.app.dokumenty.Pasek.class,
				org.kossowski.optima.app.dokumenty.Rmua.class,
				org.kossowski.optima.app.dokumenty.WyciagBankowy.class,
				org.kossowski.optima.app.dokumenty.ZaswiadczenieZp.class,
				org.kossowski.optima.app.dokumenty.ZaswiadczenieZus.class,
				org.kossowski.optima.app.dochodWydatek.DochodDzialalnoscGospodarcza.class,
				org.kossowski.optima.app.dochodWydatek.Emerytura.class,
				org.kossowski.optima.app.dochodWydatek.GospodarstwoRolne.class,
				org.kossowski.optima.app.dochodWydatek.InneDochod.class,
				org.kossowski.optima.app.dochodWydatek.InneWydatek.class,
				org.kossowski.optima.app.dochodWydatek.MOPS.class,
				org.kossowski.optima.app.dochodWydatek.Praca.class,
				org.kossowski.optima.app.dochodWydatek.PracaBrakDokumentow.class,
				org.kossowski.optima.app.dochodWydatek.Renta.class,
				org.kossowski.optima.app.dochodWydatek.UmowaDzielo.class,
				org.kossowski.optima.app.dochodWydatek.UmowaZlecenie.class,
				org.kossowski.optima.app.dochodWydatek.ZajecieKomornicze.class,
				org.kossowski.optima.app.dochodWydatek.ZasilekPrzedemerytalny.class
				);
		
	}
	
	public Marshaller getMarshaller() throws Exception {
		
		
		Marshaller m = jc.createMarshaller();
		//Unmarshaller um = jc.createUnmarshaller();
		
		m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT , true);
		
		return m;
	}

}
