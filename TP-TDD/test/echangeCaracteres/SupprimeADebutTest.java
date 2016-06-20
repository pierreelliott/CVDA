/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echangeCaracteres;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pierre-Elliott
 */
public class SupprimeADebutTest {
    

    @Test
    public void testSupprimeAPremierCar() {
        System.out.println("A est le premier caractère");
        String s = "ABCD";
        String expResult = "BCD";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeAPasPresentDebut() {
        System.out.println("A n'est pas dans les 2 premiers caractères");
        String s = "BBAA";
        String expResult = "BBAA";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeAPresentDebut() {
        System.out.println("A est dans les 2 premiers caractères");
        String s = "AACD";
        String expResult = "CD";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
        
        s = "BACD";
        expResult = "BCD";
        result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeAPresentDebutEtFin() {
        System.out.println("A est dans les 2 premiers caractères mais aussi à la fin");
        String s = "AABAA";
        String expResult = "BAA";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeAPresentDansChaindeDe2() {
        System.out.println("A n'est pas dans les 2 premiers caractères");
        String s = "AB";
        String expResult = "B";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeAPasPresent() {
        System.out.println("A n'est pas dans la chaîne");
        String s = "B";
        String expResult = "B";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeASeul() {
        System.out.println("A est seul dans la chaîne");
        String s = "A";
        String expResult = "";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSupprimeASansCar() {
        System.out.println("La chaîne est vide");
        String s = "";
        String expResult = "";
        String result = SupprimeADebut.supprimeAAuDebut(s);
        assertEquals(expResult, result);
    }
    
}
