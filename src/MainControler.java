import GUI.LotoWindow;


public class MainControler {
	LotoWindow mainFrame;
	Jeu loto;
	
	public void exit() {
		System.exit(0);
	}
	
	public void tire() {
		int tire = loto.tire();
	}
}
