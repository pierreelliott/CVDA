/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echangeCaracteres;

/**
 *
 * @author Pierre-Elliott
 */
public class SupprimeADebut {
    
    /**
     * 
     * @param s Chaîne de caractères à transformer
     * @return Enlève les "A" qui se trouvent dans les 2 premiers caractères de la chaîne "s"
     */
    public static String supprimeAAuDebut(String s){
        if(s.length()<2) return s.replace("A", "");
        return s.substring(0, 2).replace("A", "")+s.substring(2);
    }
    
}
