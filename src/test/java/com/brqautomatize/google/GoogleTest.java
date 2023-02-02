/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.brqautomatize.google;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebElement;

/**
 *
 * @author carlosfigueiredo
 */
public class GoogleTest {
    
    public GoogleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Google.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Google.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarConteudo method, of class Google.
     */
    @Test
    public void testPesquisarConteudo() {
        System.out.println("pesquisarConteudo");
        WebElement elemento = null;
        String conteudo = "";
        Google.pesquisarConteudo(elemento, conteudo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class Google.
     */
    @Test
    public void testPause() throws Exception {
        System.out.println("pause");
        Google.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActive method, of class Google.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        boolean expResult = false;
        boolean result = Google.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
