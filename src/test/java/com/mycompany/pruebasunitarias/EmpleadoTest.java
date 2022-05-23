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
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }

    /**
     * Test of getNombreEmpMejorPagado method, of class Empleado.
     */
    @Test
    public void testGetNombreEmpMejorPagado() {
        System.out.println("getNombreEmpMejorPagado");
        String expResult = "Nattu";
        String result = Empleado.getNombreEmpMejorPagado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleadoMejorPagado method, of class Empleado.
     */
    @Test
    public void testGetEmpleadoMejorPagado() {
        System.out.println("getEmpleadoMejorPagado");
        Empleado expResult = new Empleado(1, "Nattu", 15000);
        Empleado result = Empleado.getEmpleadoMejorPagado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
