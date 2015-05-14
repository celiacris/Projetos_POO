package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio01 {
	
	public static void main (String[]args) throws IOException{
		File file = new File("C:/nome.txt");
		
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file, true);
		fw.write("Felipe");
		fw.close();
		}

}
