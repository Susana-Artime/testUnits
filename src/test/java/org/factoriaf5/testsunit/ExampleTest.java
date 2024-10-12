package org.factoriaf5.testsunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;



public class ExampleTest{

    //crear el objecto example
    Example example=new Example();

    @Test
    public void testSumar(){

        // Given - Teniendo (parametros)
        int num1 = 35;
        int num2 = 79;

        // When - Cuando
        int result = example.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    
    
    }
   
   @Test
    public void testCheckPositivo() {

        boolean resultTrue = example.checkPositivo(10);
        assertTrue(resultTrue, "10 es un número positivo");
        assertThrows(IllegalArgumentException.class, () ->example.checkPositivo(-5), "Debe lanzar excepción para número negativo");
    }

    @Test
    public void testContarLetrasA() {

        String palabra="mariposa";
        int result= example.contarLetrasA(palabra);
        assertEquals(2, result);
        assertTrue(result > 1);
        assertFalse(result > 3);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);

    }
    @Test
    public void testContieneElemento() {

        List<String> frutas = List.of("limon", "pera", "manzana", "kiwi", "fresa", "platano");
        boolean resultTrue = example.contieneElemento(frutas,"pera");
        boolean resultFalse = example.contieneElemento(frutas,"sandia");
        assertTrue(resultTrue, "pera");
        assertFalse(resultFalse, "sandia");
    }
    @Test
    public void testRevertirCadena() {
        
        

    }
    @Test
    public void testFactorial() {
        
    }
    @Test
    public void testEsPrimo() {
        
    }
    @Test
    public void testMensajeConRetraso() {
        
    }
    @Test
    public void testConvertirAString() {
        
    }
    @Test
    public void testCalcularMedia() {
        
    }
    @Test
    public void testConvertirListaAString() {
        
    }
    
     
    
   
   




 }


