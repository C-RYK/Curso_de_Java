package Kontopp.cal.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	
	public Calculadora() {
		
		organizarLayout();
		
		setVisible(true);
		setSize(333, 540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void organizarLayout(){
		
		setLayout(new BorderLayout());
		
		Display display = new Display();
		
		display.setPreferredSize(new Dimension(333, 185));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		
		//teclado.setPreferredSize(new Dimension(333, 355));
		add(teclado, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		new Calculadora();
	}
}
