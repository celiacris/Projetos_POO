package events_listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio_1 {

	public static void main (String [] args){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Me cancela!");
		JButton btnCancelar = new JButton("Cancelar");
		
		frame.setContentPane(panel);
		panel.add(label);
		panel.add(btnCancelar);
		frame.setSize(200,80);
		frame.setVisible(true);
		
		btnCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);				
			}
			
			
			
		});
		
	}
}
