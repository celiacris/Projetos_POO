package interface_grafica;

import javax.swing.*;


public class Exercicio01 {

	public static void main (String args[]) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel tv = new JLabel("Digite seu nome:");
		JTextField textfield = new JTextField(18);
		JButton btnok = new JButton("Ok");
		
		frame.setSize(400,400);
		frame.setContentPane(panel);
		panel.add(tv);
		panel.add(textfield);
		panel.add(btnok);
		
		frame.setVisible(true);
	}
}
