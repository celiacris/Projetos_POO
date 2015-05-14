package interface_grafica;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho02 extends JPanel {

	Graphics[] elipse1 = new Graphics[50];
	Graphics[] elipse2 = new Graphics[50];

	public void paint(Graphics circle) {

		int largura = 10;
		int altura = 250;
		int x = 250;
		int y = 20;

		for (int i = 0; i <= 49; i++) {

			circle.drawOval(x, y, largura, altura);
			elipse1[i] = circle;
			largura = largura + 10;
			x = x - 5;
			repaint();

			}
	
		largura = 500;
		altura = 20;
		x = 5;
		y = 131;
		
		for (int n = 0; n <= 22; n++) {

			circle.drawOval(x, y, largura, altura);
			elipse2[n] = circle;
			altura = altura + 10;
			y = y - 5;
			repaint();
			}
		
		}

	}
