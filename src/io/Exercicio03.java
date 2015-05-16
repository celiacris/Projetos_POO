package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) throws IOException {

		String nome = null;
		File file = new File("C:/Users/felipe.lima/Desktop/Nomes.txt");
		FileWriter fw = new FileWriter(file);

		while (nome != "casa"){
			nome = JOptionPane.showInputDialog("Digite o nome (se a palavra 'Sair' for inserida, o programa será finalizado):");
			fw.write(nome);
		}
		

		fw.close();
		System.exit(0);
	}

}
