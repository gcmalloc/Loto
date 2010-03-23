package GUI;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import listener.MainListener;

public class WindowMenuBar extends JMenuBar {
	private static final long serialVersionUID = 7278997506279163333L;

	public WindowMenuBar(LotoWindow mainWindow) {
		MainListener listener = MainListener.getInstance(mainWindow);
		JMenu fichier = new JMenu("Fichier");
		JMenuItem quit = new JMenuItem("Quitter");
		quit.addActionListener(listener);
		JMenuItem nouv = new JMenuItem("Nouvelle partie");
		nouv.addActionListener(listener);
		fichier.add(nouv);
		fichier.add(quit);
		this.add(fichier);
		JMenu partie = new JMenu("Partie");
		JMenuItem tirer = new JMenuItem("Tirer");
		tirer.addActionListener(listener);
		JMenuItem tirMod = new JMenuItem("Changer de Mode");
		tirMod.addActionListener(listener);
		partie.add(tirer);
		partie.addSeparator();
		partie.add(tirMod);
		this.add(partie);
		JMenu option = new JMenu("Option");
		//TODO
	}
}
