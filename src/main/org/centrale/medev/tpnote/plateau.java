package org.centrale.medev.tpnote;
public class Plateau {
    private Cases = new Pion[8][8];

    /**
     * Constructeur
     */
    public Plateau() {
        Cases[3][3] = new Pion(false);
        Cases[4][4] = new Pion(false);
        Cases[3][4] = new Pion(true);
        Cases[4][3] = new Pion(true);
    }
}