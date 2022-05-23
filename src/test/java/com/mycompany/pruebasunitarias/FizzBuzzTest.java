/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasunitarias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tutu5
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    /**
     * Test of calcular method, of class FizzBuzz.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        int numero = 1;
        String expResult = "FizzBuzz";
        String result = new FizzBuzz().calcular(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
