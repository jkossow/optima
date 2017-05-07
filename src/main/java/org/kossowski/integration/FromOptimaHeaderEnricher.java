package org.kossowski.integration;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class FromOptimaHeaderEnricher {

	public static String TOKENS_DEL = "_";
	
	public String setType( File file ) {
		
		String fileName = file.getName();
		String tokens[] = fileName.split( TOKENS_DEL );
		
		return tokens[0].toUpperCase();
		
	}
	
}
