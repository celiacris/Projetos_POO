package events_listeners;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Bolinha extends JPanel {
	public int pX = 10;
	public int vX = 1;
	public int pY = 10;
	public int vY = 1;	
	@Override
	public void paint(Graphics g) { 
		g.clearRect(0, 0, getWidth(), getHeight());
		g.fillOval(pX, pY, 30, 30);
	}
	public static void main(String[] args) {
		JFrame j = new JFrame("Bolinha");
		Bolinha b = new Bolinha();
		j.setContentPane( b );
		j.setSize(640, 480);
		j.setVisible(true);
		j.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		while (true) { 
			b.pX += b.vX;
			b.pY += b.vY;
			b.repaint();
			if (b.pX > b.getWidth()) { 
				b.vX = -1;
			}
			if (b.pX < 0) { 
				b.vX = 1;
			}
			if (b.pY > b.getHeight()) { 
				b.vY = -1;
			}
			if (b.pY < 0) { 
				b.vY = 1;
			}			
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
