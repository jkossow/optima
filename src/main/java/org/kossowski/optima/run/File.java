package org.kossowski.optima.run;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class File {
	
	@XmlAttribute( name = "relateTo" )
	private FileRelatedTo relateTo;

	@XmlValue
	private String fileName;

	public File() {};
	
	public File( FileRelatedTo relateTo, String fileName ) {
		this.relateTo = relateTo;
		this.fileName = fileName;
	}
	
	public FileRelatedTo getRelateTo() {
		return relateTo;
	}

	public void setRelateTo(FileRelatedTo relateTo) {
		this.relateTo = relateTo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "File [relateTo=" + relateTo + ", fileName=" + fileName + "]";
	}
	
	
}
