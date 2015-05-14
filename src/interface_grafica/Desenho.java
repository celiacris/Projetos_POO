package interface_grafica;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho extends JPanel {
		public void paint (Graphics tri){
			
			int x[] = { 100, 150, 100, 50, 100 };
			int y[] = { 0, 50, 50, 50, 0};
			tri.drawRect(50, 50, 100, 50);
			tri.drawPolygon(x,y,5);
		}
		
	}