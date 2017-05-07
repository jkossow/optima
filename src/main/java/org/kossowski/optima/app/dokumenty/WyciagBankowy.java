package org.kossowski.optima.app.dokumenty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.Przelew;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class WyciagBankowy extends Dokument {

	
	@XmlElement( name = "Data" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date data;
	
	@XmlElement( name = "Od" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date dataOd;
	
	@XmlElement( name = "Do" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date dataDo;
	
	@XmlElementWrapper( name = "Przelewy" )
	private List<Przelew> przelewy = new ArrayList<Przelew>();
	
	
	public WyciagBankowy() {
		super( DokumentTyp.WYCIAG_BANKOWY );
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Date getDataOd() {
		return dataOd;
	}


	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}


	public Date getDataDo() {
		return dataDo;
	}


	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}


	public List<Przelew> getPrzelewy() {
		return przelewy;
	}


	public void setPrzelewy(List<Przelew> przelewy) {
		this.przelewy = przelewy;
	}
	
	
	
	
}
