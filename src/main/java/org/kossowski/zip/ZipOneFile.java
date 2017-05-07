package org.kossowski.zip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOneFile {
	
	
	public static void main( String[] args) throws Exception {
		
		byte[] buffer = new byte[1024];
		
		InputStream is = new BufferedInputStream( new FileInputStream("ubuntu.iso"), 1024);
		OutputStream os = new FileOutputStream("pom.xml.zip");
		ZipOutputStream zos = new ZipOutputStream(os);
		
		ZipEntry ze = new ZipEntry("pom.xml");
		
		zos.putNextEntry( ze );
		
		
		int len;
		while ((len = is.read(buffer,0,1024)) > 0) {
			zos.write(buffer, 0, len);
		}

		is.close();
		zos.closeEntry();

		//remember close it
		
		zos.putNextEntry( new ZipEntry("ddd"));
		zos.closeEntry();
		zos.close();
		
		System.out.println("koniec");
	}

}
