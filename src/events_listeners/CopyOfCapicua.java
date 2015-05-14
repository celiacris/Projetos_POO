package events_listeners;

import javax.swing.JOptionPane;

public class CopyOfCapicua {

	public static void main(String[] args) {

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));

		int inverso = 0;
		int potencia = 1;
		
		for (int cont = n; cont >= 10; cont /= 10) {
			potencia = potencia * 10;
			inverso = (inverso + (cont % 10)) * 10;
		}

		inverso = inverso +(inverso / potencia);
		if (inverso == n) {
			System.out.println("O número é capicua");
		} else {
			System.out.println("O número não é capicua");
		}
	}
}