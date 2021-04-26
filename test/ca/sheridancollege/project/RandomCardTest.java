/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleksandrsirik
 */
public class RandomCardTest {
    
    public RandomCardTest() {
    }
    
    @Test
    public void testDrawRandomCard() {
        System.out.println("DrawRandomCard");
        RandomCard instance = new RandomCard();
        int expResult = 0;
        int result = instance.DrawRandomCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
