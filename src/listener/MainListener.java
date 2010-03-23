package listener; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jeu.Jeu;
import GUI.*;

public class MainListener implements ActionListener {
	private static MainListener singleton;
	LotoWindow mainFrame;
	Jeu loto;
	AudioReader audio;
	CommandCheckPanel commandPanel;
	CommandTirePanel tirePanel;
	private MainListener(LotoWindow mainWindow) {
		this.loto = new Jeu();
		this.audio = new AudioReader();
		this.mainFrame = mainWindow;
		this.loto = new Jeu();
		this.audio = new AudioReader();
		this.singleton = this;
	}
	
	public static MainListener getInstance(LotoWindow mainWindow) {
        if (singleton == null) {
            singleton = new MainListener(mainWindow);
        }
        return singleton;
    }


	public void actionPerformed(ActionEvent arg0) {
	System.out.println(arg0.getActionCommand());
	String command = arg0.getActionCommand();
	if (command.equals("TIRER")) {
		this.changeCommandBoard();
	} else if (command.equals("VERIFIER") || command.equals("Changer de Mode")) {
		this.changeCommandBoard();
	} else if (command.equals("tirer") || command.equals("Tirer")) {
		this.tire();
	} else if (command.equals("Quitter")) {
		this.exit();
	} else if (command.equals("Nouvelle partie")) {
		this.newGame();
	} else if (command.equals("verifier")) {
		this.verifier();
	}
	}

	private void exit() {
		System.exit(0);
	}

	private void tire() {
		int tire = 0;
		try {
			tire = loto.tire();
		} catch (Exception e) {
			System.out.println("le jeu est plein");
			return;
		}
		this.mainFrame.setNumber(true, tire);
		this.mainFrame.setNumerosTire(tire);
	}
	
	private void verifier() {
		String toCheck = this.mainFrame.getCheckText();
		Integer check;
		try {
		check = new Integer(toCheck);
		} catch (NumberFormatException a) {
			System.out.println(a);
			this.mainFrame.setCheckText("");
			return;
		}
		boolean dejaJoue = this.loto.dejaJoue(check);
		this.mainFrame.setTire(dejaJoue);
		}
	private void newGame() {
		this.mainFrame.setVisible(false);
		this.mainFrame = new LotoWindow();
	}

	private void changeCommandBoard() {
		this.mainFrame.changeCommand();
	}
}
