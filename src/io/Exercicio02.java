package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio02 {

	public static void main(String[] args) throws IOException{

	//	File file = new File (" C:/Windows/setupact.txt");
		
		File file = new File("C:/Users/felipe.lima/Desktop/Teste.txt");
		FileReader fr = new FileReader(file);
		
		int a = 0;
		while ((a = fr.read()) != -1) {
		System.out.print((char)a);
		}
		
		fr.close();
	}

}
