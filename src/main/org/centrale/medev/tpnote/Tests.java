import java.lang.Math;

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

    public static Integer theAdder(int a, int b){
        return a+Math.abs(b);
    }
}