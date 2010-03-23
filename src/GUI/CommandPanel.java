package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CommandPanel extends JPanel {
	private static final long serialVersionUID = -5657000048806368136L;
		protected Font messageFont = new Font("Rasheeq",Font.PLAIN,20);
		
		public CommandPanel() {
			super();
			this.setBackground(new Color(0,191,255));
			BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
			Border border = BorderFactory.createEmptyBorder(10,10,10,10);
			this.setBorder(border);
			this.setLayout(layout);
	}
}
