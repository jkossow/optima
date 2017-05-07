package org.kossowski.optima.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kossowski.optima.enums.DokumentTyp;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public abstract class Dokument {
	
	@XmlAttribute( name = "Typ" )
	private DokumentTyp typ;
	
	@XmlElement( name = "CzyZeskanowany" )
	private boolean czyZeskanowany;

	public Dokument() {};
	
	protected Dokument( DokumentTyp typ ) {
		this.typ = typ; 
	}
	
	public DokumentTyp getTyp() {
		return typ;
	}

	protected void setTyp(DokumentTyp typ) {
		this.typ = typ;
	}

	public boolean isCzyZeskanowany() {
		return czyZeskanowany;
	}

	public void setCzyZeskanowany(boolean czyZeskanowany) {
		this.czyZeskanowany = czyZeskanowany;
	}

	
	
	
}
