package org.centrale.medev.tpnote;

import java.util.ArrayList;
/**
 * Plateau de jeu de 8 cases par 8 cases
 */
public class Plateau {
    private Pion[][] cases = new Pion[8][8];

    /**
     * Constructeur
     */
    public Plateau() {
        this.cases[3][3] = new Pion(true);
        this.cases[4][4] = new Pion(true);
        this.cases[3][4] = new Pion(false);
        this.cases[4][3] = new Pion(false);
    }

    /**
     * Permet d'obtenir un pion (ou null) sur une case
     * @param x la coordonnée x
     * @param y La coordonnée y
     * @return Le pion de la case 
     */

    public Pion getCase(int x, int y){
        return this.cases[x][y];
    }

    /**
     * Setter permettant de modifier le pion d'une case
     * @param x La coordonnée x
     * @param y La coordonnée y
     * @param pion Le pion à mettre sur la case
     */

    public void setCase(int x,int y, Pion pion){
        this.cases[x][y]=pion;
    }

    /**
     * Permet d'ajouter un pion d'une couleur au plateau
     * @param x La coordonnée x
     * @param y La coordonnée y
     * @param couleur La couleur du pion
     */

    public void ajout(int x, int y, boolean couleur){
        Pion pion=new Pion(couleur);
        this.setCase(x, y, pion);
    }

    /**
     * Permet d'afficher le plateau (*=Pas de pion, B=Blanc, N=Noir)
     */
    public void afficher(){
        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        String line;
        for (int i=0;i<8;i++){
            line = i+1+"\t";
            for (int j=0;j<8;j++){
                Pion pion=this.getCase(i, j);
                if (pion==null){
                    line+="*\t";
                }
                else{
                    if(pion.getCouleur()){
                        line+=("B\t");
                    }
                    else{
                        line+=("N\t");
                    }
                }
            }
            System.out.println(line);
        }
    }

    /**
     * Méthode permettant d'à partir d'une position d'obtenir tous les pions prenable
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @param couleur Couleur du Pion
     * @return La liste des pions prenables
     */
    public ArrayList<Pion> retournes(int x,int y, boolean couleur){
        ArrayList<Pion> result=new ArrayList<>();
        for (int i=-1;i<=1;i++){
            for (int j=-1;j<=1;j++){
                int k=1;
                while ((x+i*k>=0 && y+j*k>=0 && x+i*k<8 && y+j*k<8) && ((this.getCase(x+k*i, y+k*j)!=null && this.getCase(x+k*i, y+k*j).getCouleur()!=couleur))){
                    k++;
                    if ((x+i*k>=0 && y+j*k>=0 && x+i*k<8 && y+j*k<8) && (this.getCase(x+k*i, y+k*j)!=null && this.getCase(x+k*i,y+k*j).getCouleur()==couleur)){
                        for (int a=1;a<k;a++){
                            result.add(this.getCase(x+i*a,y+a*j));
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * Permet de vérfier si une position est jouable et joue si elle l'est
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @param couleur Couleur du pion
     * @return si la case est jouable ou pas
     */
    public boolean verifierDispo(int x, int y, boolean couleur){
        ArrayList<Pion> prenable=retournes(x, y, couleur);
        if (prenable.size()==0){
            return false;
        }
        else{
            ajout(x, y, couleur);
            for (Pion pion:prenable){
                pion.retourner();
            }
            return true;
        }
    }

    /**
     * Méthode permettant de déterminer si l'on peut jouer ou pas
     * @param couleur La couleur du joueur
     * @return Si l'on peut jouer ou pas
     */
    public boolean peutJouer(boolean couleur){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(retournes(i, j, couleur).size()!=0){
                    return true;
                }
            }
        }
        return false;
    }



}
