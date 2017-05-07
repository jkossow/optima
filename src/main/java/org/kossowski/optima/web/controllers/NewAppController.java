package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.xml.bind.Marshaller;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.WnioskodawcaApp;
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
import org.kossowski.optima.builders.DochodWydatekFactory;
import org.kossowski.optima.enums.Branza;
import org.kossowski.optima.enums.CzasPosiadaniaRachunkuBankowego;
import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;
import org.kossowski.optima.enums.CzasookresWyplaty;
import org.kossowski.optima.enums.DecyzjaDotyczy;
import org.kossowski.optima.enums.DochodWydatekTyp;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.enums.Etat;
import org.kossowski.optima.enums.MieszkanieTyp;
import org.kossowski.optima.enums.OkresNaliczeniaKwotyBrutto;
import org.kossowski.optima.enums.StanCywilny;
import org.kossowski.optima.enums.TakNie;
import org.kossowski.optima.enums.UmowaTyp;
import org.kossowski.optima.enums.WyksztalcenieEnum;
import org.kossowski.optima.enums.ZgodaNaKontaktSMS;
import org.kossowski.optima.enums.ZrodloInformacjiEnum;
import org.kossowski.optima.util.MarshallerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean(name="nieUzywac")
@Controller
@Scope("request")
public class NewAppController  implements Serializable {
	
		private Logger log = LoggerFactory.getLogger( this.getClass() );
	
		protected AppOptima app = FactorAppOptima.getNew();
		protected WnioskodawcaApp wnioskodawcaApp = new WnioskodawcaApp();
		protected AdresZamieszkania adresZamieszkania = new AdresZamieszkania();
		protected AdresMeldunkowy adresZameldowania = new AdresMeldunkowy();
		protected DochodWydatekTyp selDochodTyp;
		protected BigDecimal dochodNetto;
		
		protected DokumentTyp selDokumentTyp;
		protected Dokument selDokument;
		protected Map<String, Dokument> dokumenty = new HashMap<>();
		
		
		
		
		@PostConstruct
		public void setup() {
			
			
			
			buildDokumentyMap();
		}
		
		private void buildDokumentyMap() {
			
			dokumenty.put( DokumentTyp.RMUA.name(), new Rmua() );
			dokumenty.put( DokumentTyp.ZASWIADCZENIE_ZUS.name(), new ZaswiadczenieZus() );
			dokumenty.put( DokumentTyp.ODCINEK.name(), new Odcinek() );
			dokumenty.put( DokumentTyp.DECYZJA.name(), new Decyzja() );
			dokumenty.put( DokumentTyp.PASEK.name(), new Pasek() );
			dokumenty.put( DokumentTyp.ZASWIADCZENIE_ZP.name(), new ZaswiadczenieZp() );
			dokumenty.put( DokumentTyp.WYCIAG_BANKOWY.name(), new WyciagBankowy() );
			dokumenty.put( DokumentTyp.DZIALALNOSC_GOSP.name(), new DzialalnoscGospodarcza() );
			dokumenty.put( DokumentTyp.OSWIADCZENIE.name(), new Oswiadczenie() );
			dokumenty.put( DokumentTyp.INNE.name(), new Inne() );
		}

		
		public NewAppController() {
			log.info("NewAppController created");
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
		
		public ZrodloInformacjiEnum[] getZrodloInformacjiItems() {
			ZrodloInformacjiEnum[] zi = ZrodloInformacjiEnum.values();
			log.info("zrodlo informacji tab[] len " + zi.length );
			return zi;
		}
		
		
		public DokumentTyp[] getDokumentyItems() {
			return DokumentTyp.values();
		}
		
		public DecyzjaDotyczy[] getDecyzjaDotyczyItems() {
			return DecyzjaDotyczy.values();
		}
		
		public UmowaTyp[] getUmowaTypItems() {
			return UmowaTyp.values();
		}
		
		public Etat[] getEtatItems() {
			return Etat.values();
		}
		
		public TakNie[] getTakNieItems() {
			return TakNie.values();
		}
		
		public OkresNaliczeniaKwotyBrutto[] getOkresNaliczeniaKwotyBruttoItems() {
			return OkresNaliczeniaKwotyBrutto.values();
		}
		
		public WyksztalcenieEnum[] getWyksztalcenieEnumsItems() {
			return WyksztalcenieEnum.values();
		}
		
		public Branza[] getBranzaItems() {
			return Branza.values();
		}
		
		public ZgodaNaKontaktSMS[] getZgodaNaKontaktSMSItems() {
			return ZgodaNaKontaktSMS.values();
		}
		
		public CzasookresWyplaty[] getCzasookresWyplatyItems() {
			return CzasookresWyplaty.values();
		}
		
		
		public CzasPosiadaniaRachunkuBankowego[] getCzasPosiadaniaRachunkuBankowegoItems() {
			return CzasPosiadaniaRachunkuBankowego.values();
		}
		
		public MieszkanieTyp[] getMieszkanieTypItems() {
			return MieszkanieTyp.values();
		}
		
		public void updateMeldunekCzasowy() {
			log.info("Meldunek czasowy change " + adresZameldowania.getMeldunekCzasowy() );
		}
		
		public void updateDochodWydadekTyp() {
			log.info("dochod/wydatek change " + selDochodTyp );
		}
		
		public void updateSelectedDokument() {
			log.info("dokumentTyp change, new selected: " + selDokumentTyp );
			//log.info("dokumentTyp change, new selected: " + selDokumentTyp.name() );
			//selDokument = dokumenty.get( selDokumentTyp.name() );
			log.info("dokument selected: " + selDokument );
		}
		
		
		
		public String getNapis()  throws Exception {
			log.info("XML print method");
			
			//wnioskodawcaApp.getAdresy().clear();
			//wnioskodawcaApp.addAddress(adresZamieszkania);
			//wnioskodawcaApp.getMiesieczneDochodyWydatki().getDochody().clear();
			//DochodWydatek d = DochodWydatekFactory.newInstance( selDochodTyp );
			//d.setKwotaNetto( dochodNetto );
			//wnioskodawcaApp.addDochod(d);
			app.getDane().getWnioskodawcy().clear();
			app.getDane().addWnioskodawcaApp( wnioskodawcaApp );
			
			
			MarshallerBuilder mb = new MarshallerBuilder();
			Marshaller m = mb.getMarshaller();
			
			//AppOptima wniosek = new AppOptimaPrescoringBuilder().build();
			StringWriter sw = new StringWriter();
			m.marshal( app, sw );
			
			
			//return "hello";
			return sw.toString();
		}
		
		public String pokazXML()  throws Exception {
			log.info("XML print method");
			
			wnioskodawcaApp.getAdresy().clear();
			wnioskodawcaApp.addAddress(adresZamieszkania);
			wnioskodawcaApp.getMiesieczneDochodyWydatki().getDochody().clear();
			DochodWydatek d = DochodWydatekFactory.newInstance( selDochodTyp );
			d.setKwotaNetto( dochodNetto );
			wnioskodawcaApp.addDochod(d);
			app.getDane().getWnioskodawcy().clear();
			app.getDane().addWnioskodawcaApp( wnioskodawcaApp );
			
			
			MarshallerBuilder mb = new MarshallerBuilder();
			Marshaller m = mb.getMarshaller();
			
			//AppOptima wniosek = new AppOptimaPrescoringBuilder().build();
			m.marshal( app, System.out );
			
			return "";
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




		public DochodWydatekTyp getSelDochodTyp() {
			return selDochodTyp;
		}




		public void setSelDochodTyp(DochodWydatekTyp dochodTyp) {
			this.selDochodTyp = dochodTyp;
		}




		public AdresMeldunkowy getAdresZameldowania() {
			return adresZameldowania;
		}




		public void setAdresZameldowania(AdresMeldunkowy adresZameldowania) {
			this.adresZameldowania = adresZameldowania;
		}


		public DokumentTyp getSelDokumentTyp() {
			return selDokumentTyp;
		}


		public void setSelDokumentTyp(DokumentTyp dokumentTyp) {
			this.selDokumentTyp = dokumentTyp;
		}


		public Map<String, Dokument> getDokumenty() {
			return dokumenty;
		}


		public void setDokumenty( Map<String, Dokument> dokumenty) {
			this.dokumenty = dokumenty;
		}


		public Dokument getSelDokument() {
			return selDokument;
		}


		public void setSelDokument(Dokument selDokument) {
			this.selDokument = selDokument;
		}

		
		
		


		

}
