package interface_grafica;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Exercicio04 {

	public static void main(String args[]){
		
		JFrame frame = new JFrame();
		
		Desenho pintura = new Desenho();
			
		frame.setContentPane(pintura);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
