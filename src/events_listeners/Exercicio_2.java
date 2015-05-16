package events_listeners;

import java.awt.Paint;

import javax.swing.JFrame;

public class Exercicio_2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		Play pintura = new Play();
		frame.addKeyListener(pintura);
		frame.setContentPane(pintura);
		frame.setSize(540, 320);
		frame.setVisible(true);
	}

}
