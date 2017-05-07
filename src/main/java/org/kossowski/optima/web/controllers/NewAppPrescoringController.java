package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.Marshaller;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.Telefon;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.builders.DochodWydatekFactory;
import org.kossowski.optima.builders.FactorDatabaseContext;
import org.kossowski.optima.builders.FactorJpaService;
import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;
import org.kossowski.optima.enums.DochodWydatekTyp;
import org.kossowski.optima.enums.StanCywilny;
import org.kossowski.optima.util.MarshallerBuilder;
import org.kossowski.optima.web.JSFUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Controller
@Scope("view")
public class NewAppPrescoringController  implements Serializable {
	
		private Logger log = LoggerFactory.getLogger( this.getClass() );
	
		@Autowired
		FactorJpaService factorService;
		
		
		protected AppOptima app;
		protected WnioskodawcaApp wnioskodawcaApp;
		protected AdresZamieszkania adresZamieszkania;
		protected DochodWydatekTyp dochodTyp;
		protected BigDecimal dochodNetto;
		
		public NewAppPrescoringController() {}
		
		
		@PostConstruct
		public void setup() {
			String s = JSFUtils.getRequestParam("id");
			log.info("post condtruct s=" +s );
			if( s == null ) {
				this.app = FactorAppOptima.getNewPrescoring();
				this.wnioskodawcaApp = new WnioskodawcaApp();
				this.adresZamieszkania = new AdresZamieszkania();
				this.dochodTyp = null;
				this.dochodNetto = null;
			} else {
				Integer id = new Integer( s );
				FactorDatabaseContext ctx = factorService.find(id);
				this.app = factorService.unpack(ctx);
				this.wnioskodawcaApp = app.getDane().getWnioskodawca();
				this.adresZamieszkania = wnioskodawcaApp.getAdresZamieszkania();
				//this.dochodTyp = wnioskodawcaApp.getMiesieczneDochodyWydatki().
			}
			
		}

		
		
		
		public StanCywilny[] getStanCywilnyItems() {
			return StanCywilny.values();
		}
		
		public CzasZamieszkaniaPodAdresem[] getCzasZamieszkiwaniaPodAdresemItems() {
			return CzasZamieszkaniaPodAdresem.values();
		}
		
		public DochodWydatekTyp[] getDochodyItems() {
			return DochodWydatekTyp.getDochodyValues();
		}
		
		public DochodWydatekTyp[] getWydatkiValues() {
			return DochodWydatekTyp.getWydatkiValues();
		}
		
		public void addTelefon() {
			log.info( "Nowy telefon");
			wnioskodawcaApp.addTelefon( new Telefon("796821395", true) );
			log.info( "l.tel.=" + wnioskodawcaApp.getTelefony().size() );
		}
		
		
		private void assemblyApp() {
			wnioskodawcaApp.getAdresy().clear();
			wnioskodawcaApp.addAddress(adresZamieszkania);
			
	
			DochodWydatek d = DochodWydatekFactory.newInstance( dochodTyp );
			d.setKwotaNetto( dochodNetto );
			
			wnioskodawcaApp.addDochod( d );
			app.setWnioskodawca( wnioskodawcaApp );
			
		}
		
		public String pokazXML()  throws Exception {
			log.info("XML print method");
			
			assemblyApp();
			
			MarshallerBuilder mb = new MarshallerBuilder();
			Marshaller m = mb.getMarshaller();
			
			//AppOptima wniosek = new AppOptimaPrescoringBuilder().build();
			m.marshal( app, System.out );
			
			return "/panel/index.xhtml";
		}
		
		public String prepEdit() {
			String s = JSFUtils.getRequestParam("id");
			Integer id = new Integer( s );
			
			log.info( "prepEdit id=" + id );
			
			FactorDatabaseContext ctx = factorService.find( id  );
			app = factorService.unpack(ctx);
			
			
			return "/panel/wnioski/editAppPrescoring.xhtml";
		}
		
		
		public String saveApp() {
			
			assemblyApp();
			//factorService.save( app );
			
			
			return "/panel/index.xhtml";
		}
		
		
		public AppOptima getApp() {
			return app;
		}

		public void setApp(AppOptima app) {
			this.app = app;
		}

		public WnioskodawcaApp getWnioskodawcaApp() {
			return wnioskodawcaApp;
		}

		public void setWnioskodawcaApp(WnioskodawcaApp wnioskodawcaApp) {
			this.wnioskodawcaApp = wnioskodawcaApp;
		}

		public AdresZamieszkania getAdresZamieszkania() {
			return adresZamieszkania;
		}

		public void setAdresZamieszkania(AdresZamieszkania adresZamieszkania) {
			this.adresZamieszkania = adresZamieszkania;
		}

		public BigDecimal getDochodNetto() {
			return dochodNetto;
		}

		public void setDochodNetto(BigDecimal dochodNetto) {
			this.dochodNetto = dochodNetto;
		}




		public DochodWydatekTyp getDochodTyp() {
			return dochodTyp;
		}




		public void setDochodTyp(DochodWydatekTyp dochodTyp) {
			this.dochodTyp = dochodTyp;
		}


}
