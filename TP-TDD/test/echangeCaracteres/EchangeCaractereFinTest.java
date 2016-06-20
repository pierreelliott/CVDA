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
public class EchangeCaractereFinTest {
    
    @Test
    public void testEchangeChaineAvec2Car() {
        System.out.println("Avec 2 caractères");
        String s = "ab";
        String expResult = "ba";
        String result = EchangeCaractereFin.echange2DernierCar(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEchangeChaineAvec4Car() {
        System.out.println("Avec 4 caractères");
        String s = "rain";
        String expResult = "rani";
        String result = EchangeCaractereFin.echange2DernierCar(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEchangeChaineAvec7Car() {
        System.out.println("Avec 7 caractères");
        String s = "tenrain";
        String expResult = "tenrani";
        String result = EchangeCaractereFin.echange2DernierCar(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEchangeChaineAvec1Car() {
        System.out.println("Avec 1 caractères");
        String s = "a";
        String expResult = "a";
        String result = EchangeCaractereFin.echange2DernierCar(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEchangeChaineSansCar() {
        System.out.println("Sans caractères");
        String s = "";
        String expResult = "";
        String result = EchangeCaractereFin.echange2DernierCar(s);
        assertEquals(expResult, result);
        
    }
    
}
