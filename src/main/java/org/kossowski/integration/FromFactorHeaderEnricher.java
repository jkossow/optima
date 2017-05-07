package org.kossowski.integration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

@Component
public class FromFactorHeaderEnricher {

		public int setId( ArrayList<LinkedCaseInsensitiveMap<Integer>> o ) {
		
			LinkedCaseInsensitiveMap<Integer> map  = o.get(0);
			return map.get("id");
		}
		
		public  Integer setStatus( ArrayList<LinkedCaseInsensitiveMap<Integer>> o ) {
			LinkedCaseInsensitiveMap<Integer> map  = o.get(0);
			return map.get("status_wniosku");
		}
		
		
		public String setTimestamp() {
			SimpleDateFormat df = new SimpleDateFormat("YYYYMMdd'T'HHmmss");
			return df.format( new Date() );
		};
		
		public String setType( ArrayList<LinkedCaseInsensitiveMap<Integer>> o) {
			int status = o.get(0).get("status_wniosku");
			
			switch( status ) {
				case 1 : return "APP";
				case 900 : return "SMS";
				case 901 : return "CNC";
				case 902 : return "RUN";
				case 903 : return "GIRO";
				default : return "NULL";
			}
		}
		
		
}
