package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.sms.Sms;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "document" )
@XmlAccessorType( XmlAccessType.FIELD )
public class SmsOptima {
	
	@XmlAttribute( name = "version" )
	private String version = "1.1";
	
	@XmlAttribute( name = "date" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date date;
	
	@XmlElement( name = "sms" )
	private Sms sms = new Sms();

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Sms getSms() {
		return sms;
	}

	public void setSms(Sms sms) {
		this.sms = sms;
	}

	@Override
	public String toString() {
		return "SmsOptima [version=" + version + ", date=" + date + ", sms=" + sms + "]";
	}

	
	
	
}
