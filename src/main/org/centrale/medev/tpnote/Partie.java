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
		partieEnCours = true;
		jouer();
	}
	private void jouer(){
		while (partieEnCours){
			noTour +=1;
			joueurActif = false;
			boolean actionEffectue = actionJoueur(joueurActif);
		}
	}

	private boolean actionJoueur(boolean joueur){
		Logger logger = Logger.getLogger("actionJoueur");
		Scanner scan = new Scanner(System.in);
		afficherMessage(joueur);
		String action = scan.nextLine();
		boolean doitPasser = !Plateau.peutJouer();
		if (action.equals("p") && doitPasser){
			return false;
		}else if(action.equals("p")){
			logger.info("Impossible de passer");
		}else{
		int column = action.charAt(1)-'1';
		int line = action.charAt(0) - 'a';
		boolean caseValide = plateau.verifierDispo(line, column, joueur);
		while (!caseValide()){
			
		}}
	}

	private void afficherMessage(boolean joueur){
		Logger logger = Logger.getLogger("Partie en Cours");
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
}