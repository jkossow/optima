package org.kossowski.optima.web.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.kossowski.optima.builders.FactorDatabaseContext;
import org.kossowski.optima.builders.FactorJpaService;
import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;
import org.kossowski.optima.enums.DochodWydatekTyp;
import org.kossowski.optima.enums.StanCywilny;
import org.kossowski.optima.web.JSFUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Controller
@Scope("view")
public class NewAppPrescoringDBController  implements Serializable {
	
		private Logger log = LoggerFactory.getLogger( this.getClass() );
	
		@Autowired
		FactorJpaService factorService;
		
		protected FactorDatabaseContext ctx;
		
		public NewAppPrescoringDBController() {}
		
		
		@PostConstruct
		public void setup() {
			String s = JSFUtils.getRequestParam("id");
			log.info("post condtruct s=" +s );
			if( s == null ) {
				log.info( "ctx -> new");
				this.ctx = FactorDatabaseContext.getNewInstanceForPrescoring();
				
			} else {
				Integer id = new Integer( s );
				log.info( "post condtruct ctx retrieve id=" + id );
				this.ctx = factorService.find(id);
				log.info("Metoda post construct id=" + ctx.getWniosek().getId() );
				log.info( ctx.getWniosek().toString() );
				log.info( ctx.getWnioskodawca().toString() );
				
			}
			
		}

		public void dochodChanged() {
			log.info( "dochod  = " + ctx.getWnioskodawca().getDochod().getTyp() );
			log.info( "wniosek id = " + ctx.getWniosek().getId() );
			log.info( "wnioskodawca id = " + ctx.getWnioskodawca().getId() );
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
		
		
		
		public String pokazXML()  throws Exception {
			
			return "/panel/index.xhtml";
		}
		
		public String prepEdit() {
			
			
			return "/panel/wnioski/editAppPrescoringDB.xhtml";
		}
		
		
		public String saveWniosek() {
			
			
			factorService.save(ctx);
			return "/panel/index.xhtml";
		}


		public FactorDatabaseContext getCtx() {
			return ctx;
		}


		public void setCtx(FactorDatabaseContext ctx) {
			this.ctx = ctx;
		}
		
		
		


}
