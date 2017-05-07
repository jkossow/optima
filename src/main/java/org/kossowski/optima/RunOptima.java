package org.kossowski.optima;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kossowski.optima.run.FileRelatedTo;
import org.kossowski.optima.run.FilesInZip;
import org.kossowski.optima.util.DateFormatterAdapter;

@XmlRootElement( name = "loanrun")
@XmlAccessorType( XmlAccessType.FIELD )
public class RunOptima {
	
	@XmlElement( name = "id" )
	private Integer id;
	
	@XmlElement( name = "statusDateTime")
	private Date statusDateTime;
	
	@XmlElement( name = "scansFile" )
	private String scansFile;
	
	@XmlElement( name = "dateOfSignature" )
	@XmlJavaTypeAdapter( DateFormatterAdapter.class )
	private Date dateOfSignature;
	
	@XmlElement( name = "place" )
	private String place;
	
	@XmlElement( name = "person" )
	private String person;
	
	@XmlElement( name ="giro")
	private Integer giro;
	
	@XmlElement( name = "filesInZip" )
	private FilesInZip filesInZip = new FilesInZip();

	public void addFile( FileRelatedTo type, String fileName ) {
		filesInZip.addFile(type, fileName);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public String getScansFile() {
		return scansFile;
	}

	public void setScansFile(String scansFile) {
		this.scansFile = scansFile;
	}

	public Date getDateOfSignature() {
		return dateOfSignature;
	}

	public void setDateOfSignature(Date dateOfSignature) {
		this.dateOfSignature = dateOfSignature;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Integer getGiro() {
		return giro;
	}

	public void setGiro(Integer giro) {
		this.giro = giro;
	}

	public FilesInZip getFilesInZip() {
		return filesInZip;
	}

	public void setFilesInZip(FilesInZip filesInZip) {
		this.filesInZip = filesInZip;
	}

	@Override
	public String toString() {
		return "RunOptima [id=" + id + ", statusDateTime=" + statusDateTime + ", scansFile=" + scansFile
				+ ", dateOfSignature=" + dateOfSignature + ", place=" + place + ", person=" + person + ", giro=" + giro
				+ ", filesInZip=" + filesInZip + "]";
	}
	
	

}
