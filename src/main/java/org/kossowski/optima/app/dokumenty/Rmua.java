package org.kossowski.optima.app.dokumenty;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.util.DateFormatterAdapter;


@XmlRootElement( name = "Dokument" )
@XmlAccessorType( XmlAccessType.FIELD )
public class Rmua extends Dokument {

	@XmlElement( name = "PodstawaWymiaruSkladki")
	private BigDecimal podstawaWymiaruSkladki;
	
	@XmlElement( name = "ZaMesiac" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date zaMiesiac;
	
	
	public Rmua() {
		super( DokumentTyp.RMUA );
	}


	public BigDecimal getPodstawaWymiaruSkladki() {
		return podstawaWymiaruSkladki;
	}


	public void setPodstawaWymiaruSkladki(BigDecimal podstawaWymiaruSkladki) {
		this.podstawaWymiaruSkladki = podstawaWymiaruSkladki;
	}


	public Date getZaMiesiac() {
		return zaMiesiac;
	}


	public void setZaMiesiac(Date zaMiesiac) {
		this.zaMiesiac = zaMiesiac;
	}
	
	
	
	
}
