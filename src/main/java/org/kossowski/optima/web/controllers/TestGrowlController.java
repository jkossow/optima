package org.kossowski.optima.web.controllers;

import javax.faces.bean.ManagedBean;

import org.kossowski.optima.web.JSFUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("view")
@ManagedBean
public class TestGrowlController {

		protected String text;

		public String hello() {
			System.out.println( text );
			JSFUtils.addMessage("ffffffffFF");
			return "";
		}
		
		
		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		
		
}
