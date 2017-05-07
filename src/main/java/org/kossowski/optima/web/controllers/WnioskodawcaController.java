package org.kossowski.optima.web.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.kossowski.domain.Wnioskodawca;
import org.kossowski.repo.WnioskodawcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.RequestScope;

@ManagedBean
@Controller
@Scope("view")
public class WnioskodawcaController {

	
	@Autowired
	protected WnioskodawcaRepository wnioskodawcaRepo;
	
	
	
	
	public List<Wnioskodawca> getFindAll() {
		return wnioskodawcaRepo.findAll();
	}
	
}
