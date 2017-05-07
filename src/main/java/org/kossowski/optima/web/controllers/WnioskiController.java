package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.kossowski.domain.Bank;
import org.kossowski.domain.Wniosek;
import org.kossowski.repo.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.RequestScope;

@ManagedBean
@Controller
@Scope("view")
public class WnioskiController implements Serializable {

	@Autowired
	protected WniosekRepository wniosekRepo;
	
	private List<Wniosek> wnioski;
	
	@PostConstruct
	private void list() {
		wnioski = wniosekRepo.findByBank( Bank.OPTIMA );
	}

	public List<Wniosek> getFindAll() {
		return wnioski;
	}
	
}

