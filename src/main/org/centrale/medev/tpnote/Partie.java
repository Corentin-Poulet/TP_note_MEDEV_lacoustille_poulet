package org.centrale.medev.tpnote;
import java.util.Scanner;
import java.util.logging.Logger;
public class Partie{
	private Boolean joueurActif;
	private Float noTour;
	private Plateau plateau;
	private Boolean partieEnCours;
	private Boolean actionEffectue;
	private Boolean deuxiemeAction;
	Partie(){
		plateau = new Plateau();
		noTour = 0;
		partieEnCours = true;
		jouer();
		joueurActif = false;
	}
	private void jouer(){
		while (partieEnCours){
			noTour +=0.5;
			joueurActif = !joueurActif;
			actionEffectue = actionJoueur(joueurActif);
			determinerVictoire();
		}
	}

	private boolean actionJoueur(boolean joueur){
		Logger logger = Logger.getLogger("actionJoueur");
		Scanner scan = new Scanner(System.in);
		afficherMessage(joueur, false);
		String action = scan.nextLine();
		boolean doitPasser = !Plateau.peutJouer();
		boolean caseValide = false;
		if (doitPasser){
			while (!action.equals("p")){
				afficherMessage(joueur, true);
				action = scan.nextLine();
			}
			return false;
		}else{
			while (!caseValide()){
				if (action.equals("p")){logger.info(" ----- Impossible de passer -----");}
				else{
					int column = action.charAt(1)-'1';
					int line = action.charAt(0) - 'a';
					caseValide = plateau.verifierDispo(line, column, joueur);
					if (caseValide){return true;}
					action = scan.nextLine();
				}
			}}
	}

	private void afficherMessage(boolean joueur, boolean erreur){
		Logger logger = Logger.getLogger("Partie en Cours");
		if (erreur){
			logger.info("----- Impossible de jouer à cet endroit -----");
		}
		String couleur;
		if (joueur) {
			couleur = "blanc";
		}else{couleur = "noir";}
		logger.info("Vous jouez avec les"+couleur+"s");
		logger.info("Choisissez une case : ");
	}

	public Boolean getJoueurActif(){
		return joueurActif;
	}

	private void determinerFin(){
		if (!(actionEffectue||deuxiemeAction)){
			System.out.prinln("C'est la fin");
			partieEnCours = false;
		}
	}
}