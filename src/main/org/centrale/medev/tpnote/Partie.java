package org.centrale.medev.tpnote;

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
		
	}

	public Boolean getJoueurActif(){
		return joueurActif;
	}


}