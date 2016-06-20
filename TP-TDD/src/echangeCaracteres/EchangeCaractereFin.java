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
public class EchangeCaractereFin {
    
    /**
     * 
     * @param s Chaîne de caractères à transformer
     * @return Retourne la chaîne de caractère "s" si elle a moins de 2 caractères ou la chaîne "s" avec ses 2 derniers caractères inversés
     */
    public static String echange2DernierCar(String s){
        
        if(s.length()<2) return s;
        
        String t = "";
        if(s.length()>2){t = s.substring(0, s.length()-2);}
        return t+s.charAt(s.length()-1)+s.charAt(s.length()-2);
    }
    
}
