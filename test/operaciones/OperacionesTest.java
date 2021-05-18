/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author carlo
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumarPar method, of class Operaciones.
     */
    @Test
    public void testSumarPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        
        int a = 4;
        int b = 4;
        int result = instance.sumarPar(a, b);
        
        int expResult = 8;        
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testSumarImpar() {
        System.out.println("sumarImpar");
        Operaciones instance = new Operaciones();
        
        int a = 3;
        int b = 4;
        int result = instance.sumarPar(a, b);
        
        int expResult = 8;        
        assertEquals(expResult, result);
        
    }
    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMayor() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        
        int a = 7;
        int b = 8;
        int result = instance.mayor(a, b);
        
        int expResult = 8;        
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testIgual() {
        System.out.println("mayorNegativo");
        Operaciones instance = new Operaciones();
        
        int a = 8;
        int b = 8;
        int result = instance.mayor(a, b);
        
        int expResult = 8;        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        Operaciones instance = new Operaciones();
        
        int[] numeros = {2,2,4,6};
        int result = instance.sumarVector(numeros);
        
        int expResult = 14;        
        assertEquals(expResult, result);        
    }
    
}
