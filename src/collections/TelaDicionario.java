package collections;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaDicionario {

	String keyToSearch;

	public static void main(String args[]) {
		
		final ControlDicionario control = new ControlDicionario();

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Digite uma palavra: ");
		JTextField palavra = new JTextField(15);
		JButton btpesquisar = new JButton("Pesquisar");
		JLabel label2 = new JLabel("Definição: ");
		final JLabel definicao = new JLabel();
		

		frame.setSize(300, 200);
		frame.setContentPane(panel);

		panel.add(label1);
		panel.add(palavra);
		panel.add(btpesquisar);
		panel.add(label2);
		panel.add(definicao);

		btpesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String keyToSearch = definicao.getText();
				control.Validar();
			}
		});

		frame.setVisible(true);

	}
}
