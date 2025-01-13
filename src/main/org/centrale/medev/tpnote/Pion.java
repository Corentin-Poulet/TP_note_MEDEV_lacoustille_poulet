package org.centrale.medev.tpnote;

public class Pion{
    private boolean couleur;

    Pion(boolean couleur){
        this.couleur=couleur;
    }

    public boolean getCouleur(){
        return this.couleur;
    }

    public void setCouleur(boolean couleur){
        this.couleur=couleur;
    }

    public void retourner(){
        this.couleur=!this.couleur;
    }
}