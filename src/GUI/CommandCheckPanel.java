package GUI;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Position;

public class CommandCheckPanel extends CommandPanel {
	JLabel dejaTire = new JLabel("JAMAIS");
	JTextField nombre;
		
	public CommandCheckPanel() {
		super();
		JButton verifier = new JButton("VERIFIER");
		verifier.setAlignmentX(CENTER_ALIGNMENT);
		verifier.setPreferredSize(new Dimension(75, 75));
		verifier.setMaximumSize(new Dimension(75, 75));
		this.add(verifier);
		this.add(Box.createVerticalStrut(5));
		this.nombre = new JTextField(5);
		this.nombre.setHorizontalAlignment(JTextField.CENTER);
		this.nombre.setMaximumSize(new Dimension(50, 10));
		this.add(Box.createVerticalStrut(2));
		this.nombre.setAlignmentX(CENTER_ALIGNMENT);
		this.add(this.nombre);
		this.add(Box.createVerticalGlue());
		dejaTire.setFont(this.messageFont);
		dejaTire.setAlignmentX(CENTER_ALIGNMENT);
		this.add(dejaTire);
		JLabel tir = new JLabel("TIRE");
		tir.setFont(this.messageFont);
		tir.setAlignmentX(CENTER_ALIGNMENT);
		this.add(tir);
		this.add(Box.createVerticalGlue());
		
		JButton tire = new JButton("TIRER");
		tire.setAlignmentX(CENTER_ALIGNMENT);
		tire.setPreferredSize(new Dimension(75, 75));
		tire.setMaximumSize(new Dimension(75, 75));
		this.add(tire);
	}
	
	public void dejatire(boolean tire) {
		if (tire)
			this.dejaTire.setText("DEJA \n TIRE");
		else
			this.dejaTire.setText("JAMAIS \n TIRE");
	}
}
