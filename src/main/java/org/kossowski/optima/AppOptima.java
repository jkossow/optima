package org.kossowski.optima;


import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.AdresApp;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.DaneApp;
import org.kossowski.optima.app.NaglowekApp;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.builders.AppOptimaPrescoringBuilder;
import org.kossowski.optima.util.DateFormatterAdapter;





@XmlRootElement(name="document")
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( propOrder = { "naglowek", "dane" } )
public class AppOptima implements OptimaType {

	@XmlAttribute
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date date = new Date();
	
	
	@XmlAttribute
	private String version = "2.0";
	
	@XmlElement( name = "naglowek" )
	private NaglowekApp naglowek = new NaglowekApp();
	
	@XmlElement( name = "Dane" )
	private DaneApp dane = new DaneApp();
	
	
	public WnioskodawcaApp getWnioskodawca() {
		return this.dane.getWnioskodawca();
	}
	
	public void setWnioskodawca( WnioskodawcaApp w ) {
		dane.setWniodkodawca(  w );
	}
	
	
	public NaglowekApp getNaglowek() {
		return naglowek;
	}


	public void setNaglowek(NaglowekApp naglowek) {
		this.naglowek = naglowek;
	}
	
	public DaneApp getDane() {
		return dane;
	}


	public void setDane(DaneApp dane) {
		this.dane = dane;
	}

	
	
	public static void main( String[] args ) throws Exception {
		
		JAXBContext jc = JAXBContext.newInstance(AppOptima.class, AdresApp.class,
				AdresZamieszkania.class, AdresMeldunkowy.class,
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
		
		Marshaller m = jc.createMarshaller();
		//Unmarshaller um = jc.createUnmarshaller();
		
		m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT , true);
		
		/*
		AppOptima xml = new FactorAppOptima();
		AppOptimaFacade f = new AppOptimaFacade( xml );
		
		WnioskodawcaApp w = new WnioskodawcaApp();
		
		w.setPesel("68090608412");
		w.setNazwisko("Kossowski");
		w.setImie("Janusz");
		w.setDowodOsobisty("DB0942936");
		w.setSkanDowodu( true );
		w.setDyskrecja( new DyskrecjaAppOptima(true));
		w.setStanCywilny( StanCywilny.ZAMEZNA_ZONATY );
		w.setMiejsceUrodzenia("Radomsko");
		w.setIleOsobWRodzinie( 3 );
		w.setWyksztalcenie( Wyksztalcenie.SREDNIE );
		w.setRachunekaMedia( true  );
		w.setBranza( Branza.INNA );
		w.setLiczbaKartKredytoych( 2 );
		w.setCzasookresWyplaty( CzasookresWyplaty.MIESIECZNIE );
		
		AdresZamieszkiwania a = new AdresZamieszkiwania();
		a.setUlica("Sadowa");
		a.setNrDomu("7");
		a.setNrLokalu("19");
		a.setKod("97-500");
		a.setMiejscowosc("Radomsko");
		a.setCzasZamieszkaniaPodAdresem( CzasZamieszkaniaPodAdresem.DO_3_LAT );
		
		AdresMeldunkowy a1 = new AdresMeldunkowy();
		a1.setUlica("Sadowa");
		a1.setNrDomu("7");
		a1.setNrLokalu("19");
		a1.setKod("97-500");
		a1.setMiejscowosc("Radomsko");
		a1.setMeldunekCzasowy(true);
		a1.setMeldunekCzasowyDo( new Date() );
		
		
		
		w.addAddress(a);
		w.addAddress(a1);
		
		w.addTelefon( new Telefon("796821395", true));
		
		w.addDokument( new Decyzja() );
		
		w.addZgoda( new Zgoda( ZgodaTyp.PROWADZENIE_DZIALAN_MARKETINGOWYCH, "Bank" ,
				new Date(), true) );
		w.addZgoda( new Zgoda( ZgodaTyp.WERYFIKACJA_DANYCH_W_ZEWNETRZNYCH_BAZACH_BIK, "Bankq" ,
				new Date(), true) );
		
		Renta r = new Renta();
		r.setKwotaNetto( new BigDecimal(1300) );
		w.addDochod( r );
		
		ZajecieKomornicze zk = new ZajecieKomornicze();
		zk.setKwotaNetto( new BigDecimal( 200 ) );
		w.addWydatek( zk );
		
		w.addDzienOdbioruDochodow( new DzienOdbioruDochodu( 10 ));
		
		f.setTyp("Prescoring");
		f.setId(34);
		f.setRodzaj("Nowy");
		f.setMiejscePodpisania("Radomsko");
		f.setDataPodpisania( new Date() );
		f.setKtoPodpisal( "Janusz Kossowski");
		
		f.setKwota( new BigDecimal( "20000")  );
		f.setOkres( 12 );
		f.setZrodloInformacji( ZrodloInformacji.PRASA );
		
		f.setWnioskodawca(  w  );
		
		*/
		AppOptima wniosek = new AppOptimaPrescoringBuilder().build();
		m.marshal( wniosek ,  System.out);
		
	}

	@Override
	public String getType() {
		return "APP";
	}
	
}
