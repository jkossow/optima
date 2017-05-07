package org.kossowski.optima.util;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import javax.xml.bind.Marshaller;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.Adres;
import org.kossowski.optima.app.AdresApp;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.PosrednictwoApp;
import org.kossowski.optima.app.PosrednictwoFactor;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.app.dochodWydatek.DochodDzialalnoscGospodarcza;
import org.kossowski.optima.app.dochodWydatek.Emerytura;
import org.kossowski.optima.app.dochodWydatek.GospodarstwoRolne;
import org.kossowski.optima.app.dochodWydatek.InneDochod;
import org.kossowski.optima.app.dochodWydatek.InneWydatek;
import org.kossowski.optima.app.dochodWydatek.MOPS;
import org.kossowski.optima.app.dochodWydatek.Praca;
import org.kossowski.optima.app.dochodWydatek.PracaBrakDokumentow;
import org.kossowski.optima.app.dochodWydatek.Renta;
import org.kossowski.optima.app.dochodWydatek.UmowaDzielo;
import org.kossowski.optima.app.dochodWydatek.UmowaZlecenie;
import org.kossowski.optima.app.dochodWydatek.ZajecieKomornicze;
import org.kossowski.optima.app.dochodWydatek.ZasilekPrzedemerytalny;
import org.kossowski.optima.app.dokumenty.Decyzja;
import org.kossowski.optima.app.dokumenty.DzialalnoscGospodarcza;
import org.kossowski.optima.app.dokumenty.Inne;
import org.kossowski.optima.app.dokumenty.Odcinek;
import org.kossowski.optima.app.dokumenty.Oswiadczenie;
import org.kossowski.optima.app.dokumenty.Pasek;
import org.kossowski.optima.app.dokumenty.Rmua;
import org.kossowski.optima.app.dokumenty.WyciagBankowy;
import org.kossowski.optima.app.dokumenty.ZaswiadczenieZp;
import org.kossowski.optima.app.dokumenty.ZaswiadczenieZus;
import org.kossowski.optima.builders.AppOptimaPrescoringBuilder;
import org.testng.annotations.BeforeClass;

public class MarshallerBuilderTest {
	
	private Marshaller m;
	private DochodWydatek dw;
	private Dokument doc;
	private PosrednictwoApp posr;
	private AdresApp addr;
	private AppOptima app;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() throws Exception {
	  MarshallerBuilder mb = new MarshallerBuilder(); 
	  this.m = mb.getMarshaller();
  }


  @Test
  public void dwZasilekPrzedemerytalny()  throws Exception {
  
	  	dw = new ZasilekPrzedemerytalny();
	  	m.marshal(dw, System.out);
  }
  
  @Test
  public void dwZajecieKomornicze()  throws Exception {
  
	  	dw = new ZajecieKomornicze();
	  	m.marshal(dw, System.out);
  }
  
  @Test
  public void dwUmowaZlecenie() throws Exception {
	  dw = new UmowaZlecenie();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwUmowaDzielo() throws Exception {
	  dw = new UmowaDzielo();
	  m.marshal(dw, System.out);
  }


  @Test
  public void dwRenta() throws Exception {
	  dw = new Renta();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwPracaBrakDokumentow()  throws Exception {
	  dw = new PracaBrakDokumentow();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwPraca() throws Exception {
	  dw = new Praca();
	  m.marshal(dw, System.out);
  }
	
  @Test
  public void dwMOPS() throws Exception {
	  dw = new MOPS();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwInneWydatek() throws Exception {
	  dw = new InneWydatek();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwInneDochod() throws Exception {
	  dw = new InneDochod();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwGospodarstwoRolne() throws Exception {
	  dw = new GospodarstwoRolne();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwEmerytura() throws Exception {
	  dw = new Emerytura();
	  m.marshal(dw, System.out);
  }
  
  @Test
  public void dwDzialalnoscGpodarcza() throws Exception {
	  dw = new DochodDzialalnoscGospodarcza();
	  m.marshal(dw, System.out);
  }
  
  
  @Test
  public void docDecyzja() throws Exception {
	  doc = new Decyzja();
	  m.marshal(doc, System.out);
  }
  

  
  	@Test
	public void docDzialalnoscGospodarcza() throws Exception {
	  doc = new DzialalnoscGospodarcza();
	  m.marshal(doc, System.out);
	}
  
	@Test
	public void docInne() throws Exception {
	  doc = new Inne();
	  m.marshal(doc, System.out);
	}
	
	@Test
	public void docOdcinek() throws Exception {
	  doc = new Odcinek();
	  m.marshal(doc, System.out);
	}
	
	
	@Test
	public void docOswiadczenie() throws Exception {
	  doc = new Oswiadczenie();
	  m.marshal(doc, System.out);
	}
  
	
	@Test
	public void docPasek() throws Exception {
	  doc = new Pasek();
	  m.marshal(doc, System.out);
	}
	

	@Test
	public void docRmua() throws Exception {
	  doc = new Rmua();
	  m.marshal(doc, System.out);
	}
	

	@Test
	public void docWyciagBankowy() throws Exception {
	  doc = new WyciagBankowy();
	  m.marshal(doc, System.out);
	}
	
	@Test
	public void docZaswiadczenieZp() throws Exception {
	  doc = new ZaswiadczenieZp();
	  m.marshal(doc, System.out);
	}
  
	@Test
	public void docZaswiadczenieZus() throws Exception {
	  doc = new ZaswiadczenieZus();
	  m.marshal(doc, System.out);
	}
	
	@Test
	public void posrPosrednictwoApp() throws Exception {
	  posr = new PosrednictwoApp();
	  m.marshal(posr, System.out);
	}
	
	@Test
	public void posrPosrednictwoFactor() throws Exception {
	  posr = new PosrednictwoFactor();
	  m.marshal(posr, System.out);
	}
	
	
	@Test 
	public void addrAdresZamieszkania()  throws Exception {
		addr = new AdresZamieszkania();
		m.marshal( addr, System.out );
	}
	
	@Test
	public void addrAdresMeldunkowy()  throws Exception {
		addr = new AdresMeldunkowy();
		m.marshal( addr, System.out );
	}
	
	@Test
	public void appAppOptima() throws Exception {
		app = new AppOptima();
		m.marshal( app,  System.out );
	}
	
	@Test
	public void appFactorAppOptima() throws Exception {
		app = new FactorAppOptima();
		m.marshal( app,  System.out );
	}
	
	@Test
	public void appFactorAppOptima1() throws Exception {
		app = new FactorAppOptima();
		app.getDane().getWnioskodawcy().add( new WnioskodawcaApp() );
		m.marshal( app,  System.out );
	}
	
	@Test
	public void appFactorAppOptima2() throws Exception {
		AppOptima wniosek = new AppOptimaPrescoringBuilder().build();
		m.marshal( wniosek, System.out );
	}
}

