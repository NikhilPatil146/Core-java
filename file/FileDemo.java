package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("tops.txt");
		String s1="This is file write/read operation using Java";
		byte b[]=s1.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written Succesfully");
		
		FileInputStream fis=new FileInputStream("tops.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		
	}
}
