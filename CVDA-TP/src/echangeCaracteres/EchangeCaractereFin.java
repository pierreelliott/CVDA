/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echangeCaracteres;

/**
 *
 * @author p1402690
 */
public class EchangeCaractereFin {
    
    
    public static String echange2DernierCar(String s){
        
        if(s.length()>1){
            if(s.length()>2){
                System.out.println(s.substring(0, s.length()-2)+s.charAt(s.length()-1)+s.charAt(s.length()-2));
                return s.substring(0, s.length()-2)+s.charAt(s.length()-1)+s.charAt(s.length()-2);}
            System.out.println(""+s.charAt(s.length()-1)+s.charAt(s.length()-2));
            return ""+s.charAt(s.length()-1)+s.charAt(s.length()-2);
        }
        else return s;
    }
    
    
}
