package org.centrale.medev.tpnote;
/**
 * @author lacoustille_poulet
 */

public class Tests{
    
    /**
     * Affiche Hello World (test)
    * @param args 
    */

    public static void main(String[] args){
        System.out.println("Hello World !");
    }

    /**
     * Additionne un nombre et la valeur absolue d'un autre
     * @param a premier nombre
     * @param b nombre dont on prend la valeur absolue
     * @return a + |b|
     */
    public static Integer theAdder(int a, int b){
        return a+Math.abs(b);
    }
}
