package events_listeners;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Play extends Container implements KeyListener {
	
	public int X = 10;
	public int Y = 10;
	
	public void paint (Graphics circle){
		
		circle.drawOval(X, Y, X, Y);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == 39) {
			X++;
			repaint();
		}
		if (arg0.getKeyCode() == 37){
			X--;
			repaint();
		}
		if (arg0.getKeyCode() == 40) {
			Y++;
			repaint();
		}
		if (arg0.getKeyCode() == 38){
			Y--;
			repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
