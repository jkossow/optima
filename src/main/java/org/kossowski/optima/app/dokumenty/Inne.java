package org.kossowski.optima.app.dokumenty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.enums.DokumentTyp;


@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Inne extends Dokument {

	@XmlElement( name = "DodatkoweInformacje" )
	private String dodatkoweInformacje;
	
	public Inne() {
		super( DokumentTyp.INNE );
	}

	public String getDodatkoweInformacje() {
		return dodatkoweInformacje;
	}

	public void setDodatkoweInformacje(String dodatkoweInformacje) {
		this.dodatkoweInformacje = dodatkoweInformacje;
	}
	
	
	
}
