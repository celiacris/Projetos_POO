package events_listeners;

import javax.swing.JOptionPane;

public class Capicua {

	public static void main(String[] args) {

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));

		int inverso = 0;
		int potencia = 1;
		for (int cont = n; cont >= 10; cont /= 10) {
			potencia *= 10;
			inverso = (inverso + (cont % 10)) * 10;
		}// Fim for
		inverso += (inverso / potencia);
		if (inverso == n) {
			System.out.println("O número é capicua");
		} else {
			System.out.println("O número não é capicua");
		}
	}
}
