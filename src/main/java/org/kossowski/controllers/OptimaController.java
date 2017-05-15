package org.kossowski.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/optima")
public class OptimaController {
	
	//@Resource(name="chAPP")
	//@Autowired
	//protected MessageChannel chAPP;
	
	@Autowired
	protected DefaultSftpSessionFactory sftp;
	
	@RequestMapping("/app")
	@ResponseBody
	public void app( @RequestParam(name="wnId") int id ) {
	
		class Local{};
		
		
		
		Logger log = LoggerFactory.getLogger( this.getClass() );
		log.info( Local.class.getEnclosingMethod().getName() + "dec0 id=" + id );
		
	}
	
	
	
	
	@RequestMapping("/sms")
	public void sms() {
		
		Logger log = LoggerFactory.getLogger( this.getClass() );
		log.info("Hello from requestMapping sms");
		
	}
	
	@RequestMapping("/cnc")
	public void cnc() {
		
		Logger log = LoggerFactory.getLogger( this.getClass() );
		log.info("Hello from requestMapping cnc");
		
	}
	
	@RequestMapping("/run")
	public void run() {
		
		Logger log = LoggerFactory.getLogger( this.getClass() );
		log.info("Hello from requestMapping run");
		
	}
	
	@RequestMapping("/giro")
	public void giro() {
		
		Logger log = LoggerFactory.getLogger( this.getClass() );
		log.info("Hello from requestMapping giro");
		
	}
	
	//protected Message<T>
	
	

}
