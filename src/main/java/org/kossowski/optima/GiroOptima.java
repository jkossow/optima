package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name="giro" )
@XmlAccessorType( XmlAccessType.FIELD )
public class GiroOptima {
	
	@XmlElement( name = "umowa" )
	private Integer umowa;
	
	@XmlElement( name = "data" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date data;
	
	@XmlElement( name = "status" )
	private Integer status;

	public Integer getUmowa() {
		return umowa;
	}

	public void setUmowa(Integer umowa) {
		this.umowa = umowa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "GiroOptima [umowa=" + umowa + ", data=" + data + ", status=" + status + "]";
	}

	
	
	
}
