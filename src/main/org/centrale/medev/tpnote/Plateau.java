package org.centrale.medev.tpnote;

/**
 * Plateau de jeu de 8 cases par 8 cases
 */
public class Plateau {
    private Pion[][] Cases = new Pion[8][8];

    /**
     * Constructeur
     */
    public Plateau() {
        Cases[3][3] = new Pion(false);
        Cases[4][4] = new Pion(false);
        Cases[3][4] = new Pion(true);
        Cases[4][3] = new Pion(true);
    }

    public getCase(int x, int y){
        return Cases[x][y];
    }
}
