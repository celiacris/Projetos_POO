package interface_grafica;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Exercicio04b {

	public static void main(String args[]){
		
		JFrame frame = new JFrame();
		
		Desenho02 pintura = new Desenho02();
			
		frame.setContentPane(pintura);
				
		frame.setSize(540, 320);
		frame.setVisible(true);
	}
}
