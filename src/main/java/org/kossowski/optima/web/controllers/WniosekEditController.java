package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import org.kossowski.domain.StatusWniosku;
import org.kossowski.optima.builders.FactorDatabaseContext;
import org.kossowski.optima.builders.FactorJpaService;
import org.kossowski.optima.web.JSFUtils;
import org.kossowski.repo.StatusWnioskuRepository;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Controller
@Scope("request")
public class WniosekEditController implements Serializable {
	
	
		private static final long serialVersionUID = -8655050229783929291L;

		private Logger log = LoggerFactory.getLogger( this.getClass() );
	
		@Autowired
		protected StatusWnioskuRepository statusRepo;
		
		@Autowired
		protected FactorJpaService factorService;
	
		protected FactorDatabaseContext ctx = new FactorDatabaseContext();
		
		private UploadedFile file;
		
		public WniosekEditController() {
			log.info("Bean created");
		}
	
		public String prepEdit() {
			
			String s = JSFUtils.getRequestParam("id");
			
			Integer id = new Integer( s );
			
			ctx = factorService.find(id);
			
			log.info("id = " + id );
			log.info("ctx.wniosek.id =" + ctx.getWniosek().getId() );
			log.info("ctx.wniosekodawca.id =" + ctx.getWnioskodawca().getId() );
			
			return "/panel/wnioski/edit.xhtml";
		}
		
		
		
		public void statusAction( ActionEvent event) {
			
			log.info("statusAction performed");
			JSFUtils.addMessage("hello");
		}


		public List<StatusWniosku> getStatusWnioskuItems() {
			return statusRepo.statusyOptima();
		}
		
		public FactorDatabaseContext getCtx() {
			return ctx;
		}


		public void setCtx(FactorDatabaseContext ctx) {
			this.ctx = ctx;
		}

		public UploadedFile getFile() {
			return file;
		}

		public void setFile(UploadedFile file) {
			this.file = file;
		}
		
		
		

}
