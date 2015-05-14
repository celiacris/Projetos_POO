package interface_grafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exercicio02 {

	public static void main (String args[]) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Coloque seu número de telefone: ");
		JLabel label2 = new JLabel("Coloque seu nome");
		JButton btnok = new JButton("Ok");
		JButton btnsair = new JButton("Sair");
		JTextField telefone = new JTextField(11);
		JTextField nome = new JTextField(20);
		
		frame.setContentPane(panel);
		panel.add(label1);
		panel.add(telefone);
		panel.add(label2);
		panel.add(nome);
		panel.add(btnok);
		panel.add(btnsair);
		
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
}
