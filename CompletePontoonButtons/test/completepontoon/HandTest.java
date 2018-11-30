/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 16007873
 */
public class HandTest {
    
    public HandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hand method, of class Hand.
     */
    @Test
    public void testHand() {
        System.out.println("hand");
        Hand instance = new Hand();
        instance.hand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of twist method, of class Hand.
     */
    @Test
    public void testTwist() {
        System.out.println("twist");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.twist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcardNo method, of class Hand.
     */
    @Test
    public void testGetcardNo() {
        System.out.println("getcardNo");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getcardNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
