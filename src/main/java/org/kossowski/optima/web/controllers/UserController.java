package org.kossowski.optima.web.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.kossowski.domain.User;
import org.kossowski.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;



@Controller
@Scope( "view")
@ManagedBean
public class UserController implements Serializable {

	Logger log  = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	protected UserRepository userRepo;
	
	
	
	private List<User> users;
	
	public UserController() {
		
		//list();
		
		log.info("UserController created");
	}
	
	@PostConstruct
	private void list() {
		//users = userRepo.findAll();
		users = userRepo.findByNazwiskoIsNotNullAndImieIsNotNull();
		//Logger log  = LoggerFactory.getLogger(UserController.class);
		log.info("Lista utworzona");
	}
	
	public List<User> getFindAll() {
		//Logger log  = LoggerFactory.getLogger(UserController.class);
		log.info("metoda getFindAll rozmiar ->" + users.size() );
		return users;
	}
	
	
}
