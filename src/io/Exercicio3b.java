package io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio3b {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel tv = new JLabel("Digite seu nome:");
		JTextField textfield = new JTextField(18);
		JButton btnok = new JButton("Ok");
		
		frame.setSize(400,100);
		frame.setContentPane(panel);
		panel.add(tv);
		panel.add(textfield);
		panel.add(btnok);
		
		frame.setVisible(true);

	}

}
