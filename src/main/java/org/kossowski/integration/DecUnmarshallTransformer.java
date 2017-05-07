package org.kossowski.integration;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.kossowski.optima.Dec0Optima;
import org.kossowski.optima.Dec2Optima;
import org.kossowski.optima.DecOptima;
import org.springframework.stereotype.Component;

@Component
public class DecUnmarshallTransformer {

		public Dec0Optima unmarshallDEC0( File file) throws Exception {
			System.out.println("Dec0");
			
			JAXBContext jc = JAXBContext.newInstance( Dec0Optima.class );
			Unmarshaller um = jc.createUnmarshaller();
			
			Dec0Optima d = (Dec0Optima) um.unmarshal( file );
			System.out.println("Dec0 " + d);
			return d;
		}
		
		public DecOptima unmarshallDEC( File file) throws Exception {
			System.out.println("Dec");
			
			JAXBContext jc = JAXBContext.newInstance( DecOptima.class );
			Unmarshaller um = jc.createUnmarshaller();
			
			DecOptima d = (DecOptima) um.unmarshal( file );
			System.out.println("Dec " + d);
			return d;
		}
		
		public Dec2Optima unmarshallDEC2( File file) throws Exception {
			System.out.println("Dec2");
			
			JAXBContext jc = JAXBContext.newInstance( Dec2Optima.class );
			Unmarshaller um = jc.createUnmarshaller();
			
			Dec2Optima d = (Dec2Optima) um.unmarshal( file );
			System.out.println("Dec2 " + d);
			return d;
		}
		
		
	
}
