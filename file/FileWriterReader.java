package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("tops1.txt");
		String s1="This is file Writer/reader demo";
		fw.write(s1);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("tops1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
				
		
	}
}
