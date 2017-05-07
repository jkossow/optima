package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.kossowski.domain.Path;
import org.kossowski.domain.Path1;
import org.kossowski.domain.Path2;
import org.kossowski.domain.Path3;
import org.kossowski.optima.builders.FactorDatabaseContext;
import org.kossowski.optima.builders.FactorJpaService;
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
import org.kossowski.optima.web.JSFUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Controller
@Scope("view")
public class NewAppDBController  implements Serializable {
	
		
		private static final long serialVersionUID = 1L;

		private Logger log = LoggerFactory.getLogger( this.getClass() );
	
		@Autowired
		protected FactorJpaService factorService;
		
		private Map<String, Path> dokumentMap;
		
		protected FactorDatabaseContext ctx;
		
		public NewAppDBController() {
			log.info("NewAppController created");
		}
		
		
		@PostConstruct
		public void setup() {
			String s = JSFUtils.getRequestParam("id");
			log.info("post condtruct s=" +s );
			if( s == null ) {
				log.info( "ctx -> new");
				this.ctx = new FactorDatabaseContext();
				log.info( "Adres zamieszkania -> " + ctx.getWnioskodawca().getAdresZamieszkania() );
				log.info( "Adres zameldowania -> " + ctx.getWnioskodawca().getAdresZameldowania() );
				
			} else {
				Integer id = new Integer( s );
				log.info( "post condtruct ctx retrieve id=" + id );
				this.ctx = factorService.find(id);
				log.info("Metoda post construct id=" + ctx.getWniosek().getId() );
				log.info( ctx.getWniosek().toString() );
				log.info( ctx.getWnioskodawca().toString() );
				log.info( "Adres zamieszkania -> " + ctx.getWnioskodawca().getAdresZamieszkania() );
				log.info( "Adres zameldowania -> " + ctx.getWnioskodawca().getAdresZameldowania() );
				
			}
			
			buildDokumentMap();
		}
		
		private void buildDokumentMap()   {
			dokumentMap = new HashMap<>();
			
			try {
			
				dokumentMap.put( DokumentTyp.RMUA.name(), (Path)ctx.getPath2().clone() );
				dokumentMap.put( DokumentTyp.ZASWIADCZENIE_ZUS.name(), (Path)ctx.getPath2().clone() );
				dokumentMap.put( DokumentTyp.ODCINEK.name(), (Path)ctx.getPath2().clone() );
				dokumentMap.put( DokumentTyp.DECYZJA.name(), (Path)ctx.getPath2().clone() );
				dokumentMap.put( DokumentTyp.PASEK.name(), (Path)ctx.getPath1().clone() );
				dokumentMap.put( DokumentTyp.ZASWIADCZENIE_ZP.name(), (Path)ctx.getPath1().clone() );
				dokumentMap.put( DokumentTyp.WYCIAG_BANKOWY.name(), (Path)ctx.getPath1().clone() );
				dokumentMap.put( DokumentTyp.DZIALALNOSC_GOSP.name(), (Path)ctx.getPath3().clone() );
				dokumentMap.put( DokumentTyp.OSWIADCZENIE.name(), (Path)ctx.getPath1().clone() );
				dokumentMap.put( DokumentTyp.INNE.name(), (Path)ctx.getPath3().clone() );
			} catch ( CloneNotSupportedException e) {
				log.info("Cloneable not supported");
			};
			
		}

		
		public String saveWniosek() {
			
			log.info("Save");
			log.info("save - ctx.path1 -> " + ctx.getPath1() );
			log.info("save - ctx.path2 -> " + ctx.getPath2() );
			log.info("save - ctx.path3 -> " + ctx.getPath3() );
			log.info("rmua     -> " + dokumentMap.get( DokumentTyp.RMUA.name() ));
			log.info("zasw zus -> " + dokumentMap.get( DokumentTyp.ZASWIADCZENIE_ZUS.name()) );
			log.info("odcinek  -> " + dokumentMap.get( DokumentTyp.ODCINEK.name()));
			log.info("decyzja  -> " + dokumentMap.get( DokumentTyp.DECYZJA.name() ));
			log.info("dokument selected: " + ctx.getWnioskodawca().getDokument() );
			
			DokumentTyp d = ctx.getWnioskodawca().getDokument();
			Path p = dokumentMap.get( d.name() );
			switch( d.getPath() ) {
				case 1: ctx.setPath1( (Path1) p); break;
				case 2: ctx.setPath2( (Path2) p); break;
				case 3:	ctx.setPath3( (Path3) p); break;
			}
			
			factorService.save(ctx);
			log.info("Saved");
			JSFUtils.addMessage("Zapisano");
			return "/panel/index.xhtml";
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
			//log.info("zrodlo informacji tab[] len " + zi.length );
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
		
		
		
		public void updateDochodWydadekTyp() {
			log.info("dochod/wydatek change " + ctx.getWnioskodawca().getDochod().getTyp() );
		}
		
		public void updateSelectedDokument() {
			log.info("udateSelectedDokument start");
			log.info("dokumentTyp change, new selected: " + ctx.getWnioskodawca().getDokument() );
			//log.info("dokumentTyp change, new selected: " + selDokumentTyp.name() );
			//selDokument = dokumenty.get( selDokumentTyp.name() );
			log.info("rmua     -> " + dokumentMap.get( DokumentTyp.RMUA.name() ));
			log.info("zasw zus -> " + dokumentMap.get( DokumentTyp.ZASWIADCZENIE_ZUS.name()) );
			log.info("odcinek  -> " + dokumentMap.get( DokumentTyp.ODCINEK.name()));
			log.info("decyzja  -> " + dokumentMap.get( DokumentTyp.DECYZJA.name() ));
			log.info("dokument selected: " + ctx.getWnioskodawca().getDokument() );
			log.info("updateSelectedDocument end");
			JSFUtils.addMessage("Zapisano ++");
			//JSFUtils.addMessage( ctx.getPath1().toString() );
			//JSFUtils.addMessage( ctx.getPath2().toString() );
			//JSFUtils.addMessage( ctx.getPath3().toString() );
			
		}
		
		
		
		public void updateMeldunekCzasowy() {
			log.info("Meldunek czasowy change " + ctx.getWnioskodawca().getAdresZameldowania().getMeldunekCzasowy() );
		}
		
		
		
		
		public String prepEdit() {
			
			
			return "/panel/wnioski/editAppDB.xhtml";
		}
		
		
		public String getNapis()  {
			log.info("XML print method");
			
			return "";
			
		}
		
		public String pokazXML()  {
			log.info("XML print method");
			
		
			return "";
		}
		
		
	
		



		public FactorDatabaseContext getCtx() {
			return ctx;
		}

		public void setCtx(FactorDatabaseContext ctx) {
			this.ctx = ctx;
		}


		public FactorJpaService getFactorService() {
			return factorService;
		}


		public void setFactorService(FactorJpaService factorService) {
			this.factorService = factorService;
		}


		public Map<String, Path> getDokumentMap() {
			return dokumentMap;
		}


		public void setDokumentMap(Map<String, Path> dokumentMap) {
			this.dokumentMap = dokumentMap;
		}

		
		
		


		

}
