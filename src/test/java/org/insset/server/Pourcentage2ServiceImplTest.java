/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class Pourcentage2ServiceImplTest {
    
    public Pourcentage2ServiceImplTest() {
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
     * Test of convertToBaseNumber method, of class Pourcentage2ServiceImpl.
     */
    @Test
    public void testConvertToBaseNumber() {
        System.out.println("convertToBaseNumber");
        Integer nbr = 80;
        Integer percent = 20;
        Pourcentage2ServiceImpl instance = new Pourcentage2ServiceImpl();
        Integer expResult = 100;
        Integer result = instance.convertToBaseNumber(nbr, percent);
        assertEquals(expResult, result);
    }
    
//    @Test (expected = IllegalArgumentException.class)
//    public void testConvertToBaseNumberILLEGALBASE() {
//        System.out.println("convertToBaseNumber");
//        Integer nbr = 99999;
//        Integer percent = 20;
//        Pourcentage2ServiceImpl instance = new Pourcentage2ServiceImpl();
//        instance.convertToBaseNumber(nbr, percent);
//    }
//    
//    @Test (expected = IllegalArgumentException.class)
//    public void testConvertToBaseNumberILLEGALPERCENT() {
//        System.out.println("convertToBaseNumber");
//        Integer nbr = 80;
//        Integer percent = 120;
//        Pourcentage2ServiceImpl instance = new Pourcentage2ServiceImpl();
//        instance.convertToBaseNumber(nbr, percent);
//    }
    
}
