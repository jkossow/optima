package org.kossowski.optima.app;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.util.DateFormatterAdapter;




@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class WniosekApp {
	
	@XmlAttribute( name = "bpf-Id" )
	private int id;
	
	@XmlAttribute( name = "Typ" )
	private String typ;
	
	@XmlAttribute( name = "Rodzaj" )
	private String rodzaj; 

	@XmlElement( name = "Posrednictwo")
	private PosrednictwoApp posrednictwo = new PosrednictwoApp(); 
	
	@XmlElement( name = "DataPodpisania" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date dataPodpisania;
	
	@XmlElement( name = "MiejscePodpisania" )
	private String miejscePodpisania;
	
	@XmlElement( name = "KtoPodpisal")
	private String ktoPodpisal;
	

	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	public String getRodzaj() {
		return rodzaj;
	}
	
	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
	public PosrednictwoApp getPosrednictwo() {
		return posrednictwo;
	}
	
	public void setPosrednictwo(PosrednictwoApp posrednictwo) {
		this.posrednictwo = posrednictwo;
	}
	
	public Date getDataPodpisania() {
		return dataPodpisania;
	}
	
	public void setDataPodpisania(Date dataPodpisania) {
		this.dataPodpisania = dataPodpisania;
	}
	
	public String getMiejscePodpisania() {
		return miejscePodpisania;
	}
	
	public void setMiejscePodpisania(String miejscePodpisania) {
		this.miejscePodpisania = miejscePodpisania;
	}
	
	public String getKtoPodpisal() {
		return ktoPodpisal;
	}
	
	public void setKtoPodpisal(String ktoPodpisal) {
		this.ktoPodpisal = ktoPodpisal;
	}
	
}
