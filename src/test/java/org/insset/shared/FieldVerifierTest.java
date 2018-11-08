/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidName() {
//        System.out.println("isValidName");
//        String name = "";
//        boolean expResult = false;
//        boolean result = FieldVerifier.isValidName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalTRUE() {
        System.out.println("isValidDecimalTRUE");
        Integer nbr = 35;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertTrue("La valeur doit être un entier entre 1 et 2000", result);
    }
    
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalOFFLIMITS() {
        System.out.println("testIsValidDecimalOFFLIMITS");
        Integer nbr = 2001;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertFalse("La valeur doit être un entier entre 1 et 2000", result);
    }

    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRoman() {
//        System.out.println("isValidRoman");
//        String nbr = "";
//        boolean expResult = false;
//        boolean result = FieldVerifier.isValidRoman(nbr);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDate() {
//        System.out.println("isValidDate");
//        String date = "";
//        boolean expResult = false;
//        boolean result = FieldVerifier.isValidDate(date);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
