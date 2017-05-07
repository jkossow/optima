package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class PosrednictwoFactor  extends PosrednictwoApp {
	
	public PosrednictwoFactor() {
		super("D4649", "AA45455/111200", "AA45455/111201", "AUTOKREDYTY" );
	}

}
