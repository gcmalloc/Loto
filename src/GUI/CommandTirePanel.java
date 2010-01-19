package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CommandTirePanel extends CommandPanel {
	private JLabel numerosTire;
	
	public CommandTirePanel() {
		JButton tire = new JButton("TIRER");
		tire.setAlignmentX(CENTER_ALIGNMENT);
		tire.setPreferredSize(new Dimension(75, 75));
		tire.setMaximumSize(new Dimension(75, 75));
		this.add(tire);
		this.add(Box.createVerticalGlue());
		JLabel numeros = new JLabel("Numero");
		numeros.setFont(this.messageFont);
		numeros.setAlignmentX(CENTER_ALIGNMENT);
		this.add(numeros);
		JLabel tir = new JLabel("Tire");
		tir.setFont(this.messageFont);
		tir.setAlignmentX(CENTER_ALIGNMENT);
		this.add(tir);
		this.numerosTire = new JLabel("00");
		this.numerosTire.setFont(this.messageFont.deriveFont(3));
		this.numerosTire.setAlignmentX(CENTER_ALIGNMENT);
		this.add(numerosTire);
		this.add(Box.createVerticalGlue());
		JButton verif = new JButton("VERIFIER");
		verif.setPreferredSize(new Dimension(75, 75));
		verif.setMaximumSize(new Dimension(75, 75));
		verif.setAlignmentX(CENTER_ALIGNMENT);
		this.add(verif);
	}
	
	public void setNumeroTire(int i) {
		Integer ent = new Integer(i);
		this.numerosTire.setText(ent.toString());
	}
}
