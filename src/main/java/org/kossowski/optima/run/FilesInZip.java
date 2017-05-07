package org.kossowski.optima.run;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class FilesInZip {
	
	@XmlAttribute( name = "id" )
	private int id = 1;
	
	@XmlAttribute( name = "main" )
	private boolean main = true;

	@XmlElement( name = "file")
	private List<File> files = new ArrayList<>();

	public void addFile( FileRelatedTo type, String fileName ) {
		files.add( new File( type, fileName ));
	}
	
	public void addFile( File f) {
		files.add( f );
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isMain() {
		return main;
	}


	public void setMain(boolean main) {
		this.main = main;
	}


	public List<File> getFiles() {
		return files;
	}


	public void setFiles(List<File> files) {
		this.files = files;
	}


	@Override
	public String toString() {
		return "FilesInZip [id=" + id + ", main=" + main + ", files=" + files + "]";
	}
	
	
	
	
}
