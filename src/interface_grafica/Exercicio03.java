package interface_grafica;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exercicio03 {

	public static void main (String args[]) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel header = new JPanel();
		JPanel inner = new JPanel();
		BorderLayout border = new BorderLayout(5,20);
		GridLayout grid = new GridLayout(4,4,2,2);
		GridLayout gridHeader = new GridLayout(0,2,6,15);
		JTextField text = new JTextField(10);
		JButton btnCE = new JButton("CE");
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnMultiplicar = new JButton("*");
		JButton btnSubtrair = new JButton("-");
		JButton btnSomar = new JButton("+");
		JButton btnDividir = new JButton("/");
		JButton btnPonto = new JButton(".");
		JButton btnIgual = new JButton("=");

		header.setLayout(gridHeader);
		header.add(text);
		header.add(btnCE);
		
		inner.setLayout(grid);
		inner.add(btn1);
		inner.add(btn2);
		inner.add(btn3);
		inner.add(btnSomar);
		inner.add(btn4);
		inner.add(btn5);
		inner.add(btn6);
		inner.add(btnSubtrair);
		inner.add(btn7);
		inner.add(btn8);
		inner.add(btn9);
		inner.add(btnMultiplicar);
		inner.add(btnPonto);
		inner.add(btn0);
		inner.add(btnIgual);
		inner.add(btnDividir);
		
	    frame.setContentPane(panel);
		panel.setLayout(border);
		panel.add(header,BorderLayout.NORTH);
		panel.add(inner, BorderLayout.CENTER);
		
		frame.setSize(200,250);
		frame.setVisible(true);

		}
}
