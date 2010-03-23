package main;
import java.sql.Time;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.SliderUI;

import jeu.Jeu;

import GUI.AudioReader;
import GUI.LotoWindow;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		LotoWindow loto = new LotoWindow();
	}
	private static void menu() {
		Jeu loto = new Jeu();
		Scanner scan = new Scanner(System.in);
		String command = "";
		boolean checkStep = false;
		while (!command.equals("S")) {
			if (checkStep) {
				System.out
						.println("Etape de verifcation taper N pour en sortir");
				System.out
						.println("Entrez le nombre que vous voulez verifier ou N pour continuer la criee");
					System.out.println(loto.dejaJoue(getNumber()));
				if (command.equals("N")) {
					checkStep = false;
				}
			} else {
				System.out
						.println("Entrez la commande (taper help pour un rappel des commandes)");
				command = scan.next();
				if (command.equals("help")) {
					afficheHelp();
				} else if (command.equalsIgnoreCase("N")) {
					System.out.println("le nombre est");
					try {
						loto.tire();
					} catch (Exception e) {
						System.out.println("le jeu est plein");
					}
				} else if (command.equalsIgnoreCase("C")) {
					checkStep = true;
				}
			}
		}
	}
	private static void afficheHelp() {
		System.out.println("commandes");
		System.out.println("S : quitter le programme");
		System.out.println("N : donnez le prochain numeros");
		System.out.println("C : passez en mode verification de numeros");
		System.out.println();
	}
	
	private static int getNumber() {
	Scanner scan = new Scanner(System.in);
	String scanne = scan.next();
	Integer inte = Integer.valueOf(scanne);
	return inte.intValue();
	}
	
	private void setLookAndFeel(){
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
