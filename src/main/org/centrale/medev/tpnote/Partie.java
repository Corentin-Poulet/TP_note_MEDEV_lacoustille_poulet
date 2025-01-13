package org.centrale.medev.tpnote;
import java.util.Scanner;
import java.util.logging.Logger;
public class Partie{
	private Boolean joueurActif;
	private Integer noTour;
	private Plateau plateau;
	private Boolean partieEnCours;

	Partie(){
		plateau = new Plateau();
		noTour = 0;
		jouer();
		partieEnCours = true;
	}
	private void jouer(){
		while (partieEnCours){
			noTour +=1;
			joueurActif = false;
			actionJoueur(joueurActif);
		}
	}

	private void actionJoueur(boolean joueur){
		Scanner scan = new Scanner(System.in);
		String action = scan.nextLine();
		char line = action.charAt(1);
		int column = action.charAt(0) - '0';
	}

	private void afficherMessage(boolean joueur){
		Logger logger = Logger.getGlobal();
		String couleur;
		if (joueur) {
			couleur = "blanc";
		}else{couleur = "noir";}
		logger.info("Vous jouez avec les"+couleur+"s");
		logger.info("Choisissez une case : ");
		logger.info("Choisissez une case : ");
	}
	public Boolean getJoueurActif(){
		return joueurActif;
	}
}