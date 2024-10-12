package org.factoriaf5.testsunit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;



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

        boolean result = example.checkPositivo(10);
        assertTrue(result, "10 es un número positivo");
        assertTrue(example.checkPositivo(0), "0 debe ser considerado positivo");
        assertThrows(IllegalArgumentException.class, () ->example.checkPositivo(-5), "Debe lanzar excepción para número negativo");
        assertNotNull(result);
        assertInstanceOf(Boolean.class, result);
        
    }

    @Test
    public void testContarLetrasA() {

        String palabra="mariposa";
        int result= example.contarLetrasA(palabra);
        assertEquals(2, result);
        assertEquals(0, example.contarLetrasA(""), "La cadena vacía debe tener 0 letras 'a'");
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
        assertTrue(resultTrue, "La lista debe contener 'pera'");
        assertFalse(resultFalse, "La lista no debe contener 'sandia'");
        assertNotNull(resultTrue);
        assertInstanceOf(Boolean.class, resultTrue);
        assertNotNull(resultFalse);
        assertInstanceOf(Boolean.class, resultFalse);
    }
    @Test
    public void testRevertirCadena() {
        
        String palabra="gato";
        String result= example.revertirCadena(palabra);
        assertEquals("otag", result);
        assertEquals("", example.revertirCadena(""), "La cadena vacía debe seguir vacía");
        assertThrows(NullPointerException.class, () -> example.revertirCadena(null), "Debería lanzar una excepción si la cadena es nula");
        assertNotNull(result);
        assertInstanceOf(String.class, result);


    }
    @Test
    public void testFactorial() {

        long result = example.factorial(5);
        assertEquals(1, example.factorial(0), "El factorial de 0 debe ser 1");
        assertEquals(1, example.factorial(1), "El factorial de 1 debe ser 1");
        assertEquals(2, example.factorial(2), "El factorial de 2 debe ser 2");
        assertEquals(120, result);
        assertTrue(result > 100);
        assertFalse(result > 130);
        assertThrows(IllegalArgumentException.class, () ->example.factorial(-5), "Debe lanzar excepción para número negativo");
        assertNotNull(result);
        assertInstanceOf(Long.class, result);

        
    }
    @Test
    public void testEsPrimo() {
        boolean resultTrue = example.esPrimo(3);
        boolean resultFalse = example.esPrimo(-1);
        assertTrue(resultTrue, "3 es un número primo");
        assertFalse(resultFalse, "-1 no es un numero primo");
        assertNotNull(resultTrue);
        assertInstanceOf(Boolean.class, resultTrue);
        assertNotNull(resultFalse);
        assertInstanceOf(Boolean.class, resultFalse);
        

        
    }
    @Test
    public void testMensajeConRetraso() throws InterruptedException {

            long startTime = System.currentTimeMillis(); 
            String result = example.mensajeConRetraso();                  
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            assertEquals("Listo después de retraso", result, "El resultado es el esperado.");
            assertTrue(elapsedTime >= 5000 && elapsedTime < 6000, "El tiempo de ejecución no está dentro del rango esperado.");
            assertNotNull(result);
            assertInstanceOf(String.class, result);
    }
    @Test
    public void testConvertirAString() {
        
        List<Integer> numeros = List.of(14, 24, 34, 44, 54, 64);
        List<String> result = example.convertirAString(numeros);
        List<String> resultExpected = List.of("14", "24", "34", "44", "54","64");
        assertEquals(resultExpected, result, "La lista de cadenas coincide con la lista esperada.");
        assertNotNull(result);
        assertInstanceOf(List.class, result);
        
    }
    @Test
    public void testCalcularMedia() {

        List<Integer> numeros = List.of(8, 9, 10, 7, 9, 8);
        List<Integer> numerosVacio = List.of();
        List<Integer> numerosNull = new ArrayList<>(Arrays.asList(null, null, null));
        double result = example.calcularMedia(numeros);        
        assertEquals(8.5, result, "La media debe ser 8.5");
        assertTrue(result > 8);
        assertFalse(result > 9);
        assertNotNull(result);
        assertInstanceOf(Double.class, result);
        assertThrows(IllegalArgumentException.class, () ->example.calcularMedia(numerosVacio), "Debe lanzar excepción para lista vacia");
        assertThrows(NullPointerException.class, () ->example.calcularMedia(numerosNull), "Debe lanzar excepción para lista nula");
       

    } 
    
    @Test
    public void testConvertirListaAString() {
        
        List<String> cadenas = List.of("uno", "dos", "tres");
        List<Integer> numerosNull = new ArrayList<>(Arrays.asList(null, null, null));
        String result = example.convertirListaAString(cadenas);
        assertEquals("UNO,DOS,TRES", result);
        assertNotNull(result);
        assertInstanceOf(String.class, result);
        assertThrows(NullPointerException.class, () ->example.calcularMedia(numerosNull), "Debe lanzar excepción para lista nula");
             

    }
        
       
 }
    
     
    
   
 




 


