package Kontopp.cal.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.white);
		setFont(new Font("Times New Roman", Font.PLAIN, 25));
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
}
