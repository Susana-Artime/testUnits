package org.factoriaf5.testsunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
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
        
        String palabra="gato";
        String result= example.revertirCadena(palabra);
        assertEquals("otag", result);
        assertNotNull(result);
        assertInstanceOf(String.class, result);

    }
    @Test
    public void testFactorial() {

        long result = example.factorial(5);
        assertEquals(120, result);
        assertTrue(result > 100);
        assertFalse(result > 130);
        assertThrows(IllegalArgumentException.class, () ->example.factorial(-5), "Debe lanzar excepción para número negativo");

        
    }
    @Test
    public void testEsPrimo() {
        boolean resultTrue = example.esPrimo(3);
        boolean resultFalse = example.esPrimo(-1);
        assertTrue(resultTrue, "3 es un número primo");
        assertFalse(resultFalse, "-1 no es un numero primo");
        

        
    }
    @Test
    public void testMensajeConRetraso() throws InterruptedException {

            long startTime = System.currentTimeMillis(); 
            String result = example.mensajeConRetraso();                  
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            assertEquals("Listo después de retraso", result, "El resultado es el esperado.");
            assertTrue(elapsedTime >= 5000 && elapsedTime < 6000, "El tiempo de ejecución no está dentro del rango esperado.");
    }
    @Test
    public void testConvertirAString() {
        
        List<Integer> numeros = List.of(14, 24, 34, 44, 54, 64);
        List<String> result = example.convertirAString(numeros);
        List<String> resultExpected = Arrays.asList("14", "24", "34", "44", "54","64");
        assertEquals(resultExpected, result, "La lista de cadenas coincide con la lista esperada.");
        
    }
    @Test
    public void testCalcularMedia() {

        List<Integer> numeros = List.of(8, 9, 10, 7, 9, 8);
        List<Integer> numerosVacio = List.of();
        double result = example.calcularMedia(numeros);
        assertEquals(8.5, result);
        assertTrue(result > 8);
        assertFalse(result > 9);
        assertThrows(IllegalArgumentException.class, () ->example.calcularMedia(numerosVacio), "Debe lanzar excepción para número negativo");

       
    }
    @Test
    public void testConvertirListaAString() {
        
        List<String> frutas = List.of("limon", "pera", "manzana", "kiwi", "fresa", "platano");
        String result = example.convertirListaAString(frutas);
        
        
       
    }
    
     
    
   
   




 }


