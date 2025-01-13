package org.centrale.medev.tpnote;

import org.centrale.medev.tpnote.Pion;

/**
 * Plateau de jeu de 8 cases par 8 cases
 */
public class Plateau {
    private Pion[][] cases = new Pion[8][8];

    /**
     * Constructeur
     */
    public Plateau() {
        cases[3][3] = new Pion(false);
        cases[4][4] = new Pion(false);
        cases[3][4] = new Pion(true);
        cases[4][3] = new Pion(true);
    }

    public Pion getCase(int x, int y){
        return cases[x][y];
    }
}
