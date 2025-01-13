package org.centrale.medev.tpnote;


/**
 * Plateau de jeu de 8 cases par 8 cases
 */
public class Plateau {
    private Pion[][] cases = new Pion[8][8];

    /**
     * Constructeur
     */
    public Plateau() {
        this.cases[3][3] = new Pion(false);
        this.cases[4][4] = new Pion(false);
        this.cases[3][4] = new Pion(true);
        this.cases[4][3] = new Pion(true);
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
        for (int i=0;i<8;i++){
            System.out.println(i+1+"\t");
            for (int j=0;j<8;j++){
                Pion pion=this.getCase(i, j);
                if (pion==null){
                    System.out.println("*\t");
                }
                else{
                    if(pion.getCouleur()){
                        System.out.println("B\t");
                    }
                    else{
                        System.out.println("N\t");
                    }
                }
            }
        }
    }


}
