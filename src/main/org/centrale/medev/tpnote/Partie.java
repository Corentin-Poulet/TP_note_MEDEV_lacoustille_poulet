package org.centrale.medev.tpnote;
import java.util.Scanner;
import java.util.logging.Logger;
public class Partie{
	private Boolean joueurActif;
	private Double noTour;
	private Plateau plateau;
	private Boolean partieEnCours;
	private Boolean actionEffectue;
	private Boolean deuxiemeAction;
	Partie(){
		plateau = new Plateau();
		noTour = 0.0;
		partieEnCours = true;
		joueurActif = false;
		jouer();
	}
	private void jouer(){
		while (partieEnCours){
			noTour +=0.5;
			joueurActif = !joueurActif;
			plateau.afficher();
			actionEffectue = actionJoueur(joueurActif);
			determinerVictoire();
		}
	}

	private boolean actionJoueur(boolean joueur){
		Logger logger = Logger.getLogger("actionJoueur");
		Scanner scan = new Scanner(System.in);
		afficherMessage(joueur, false);
		String action = scan.nextLine();
		boolean doitPasser = !(plateau.peutJouer(joueur));
		boolean caseValide = false;
		if (doitPasser){
			while (!action.equals("p")){
				afficherMessage(joueur, true);
				action = scan.nextLine();
			}
			return false;
		}else{
			while (!caseValide){
				if (action.equals("p")){
					logger.info(" ----- Impossible de passer -----");
			}
				else{
					int column = action.charAt(1)-'1';
					int line = action.charAt(0) - 'a';
					caseValide = plateau.verifierDispo(line, column, joueur);
					if (caseValide){
						return true;
					}
					action = scan.nextLine();
				}
			}
			return true;
		}
	}

	public static void afficherMessage(boolean joueur, boolean erreur){
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

	private void determinerVictoire(){
		Logger logger = Logger.getLogger("endGame");
		if (!(actionEffectue||deuxiemeAction)){
			logger.info("C'est la fin");
			partieEnCours = false;
			boolean vainqueur = (compterPions()>0);
			String couleur;
			if (vainqueur) {
				couleur = "blanc";
			}else{couleur = "noir";}
			logger.info("le joueur "+couleur+" a gagné la partie!");

		}
	}

	private int compterPions(){
		int noirs = 0;
		int blancs = 0;
		for (int i=0;i<8 ;i++ ) {
			for (int j=0;j<8 ;j++ ) {
				if (plateau.getCase(i, j)!=null){
					if (plateau.getCase(i, j).getCouleur()){
						blancs+=1;
					}else{
						noirs+=1;
					}
				}
			}
			
		}
		return blancs-noirs;
	}
}