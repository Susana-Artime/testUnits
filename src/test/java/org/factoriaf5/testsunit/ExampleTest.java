package org.factoriaf5.testsunit;
import static org.junit.jupiter.api.Assertions.*;
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
        String palabraVarias = "manzana";
        int resultVarias = example.contarLetrasA(palabraVarias);
        String palabraVacia = "";
        int resultVacia = example.contarLetrasA(palabraVacia);
        String cadenaMin = "Ana María";
        int resultMin = example.contarLetrasA(cadenaMin);
        String cadenaCaracteres = "a@123 a";
        int resultCaracteres = example.contarLetrasA(cadenaCaracteres);


        assertEquals(2, result,"Debe contar dos letras 'a'");
        assertEquals(3, resultVarias, "Debe contar exactamente tres letras 'a'.");
        assertEquals(0, resultVacia, "La cadena vacía debe tener 0 letras 'a'");
        assertEquals(3, resultMin, "Debe contar las letras a mayusculas y minusculas");
        assertEquals(2, resultCaracteres, "Debe contar correctamente las letras 'a' sin importar los caracteres especiales.");
        assertTrue(result > 1);
        assertFalse(result > 3);
        assertInstanceOf(Integer.class, result);
        assertThrows(NullPointerException.class, () -> example.contarLetrasA(null), "Debe lanzar excepción si la cadena es nula");

    }

    @Test
    public void testContieneElemento() {

        List<String> frutas = Arrays.asList("limon", "pera", "manzana", "kiwi", "fresa", "platano");
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
        
        List<Integer> numeros = Arrays.asList(14, 24, 34, 44, 54, 64);
        List<String> result = example.convertirAString(numeros);
        List<String> resultExpected = Arrays.asList("14", "24", "34", "44", "54","64");
        assertEquals(resultExpected, result, "La lista de cadenas coincide con la lista esperada.");
        assertNotNull(result);
        assertInstanceOf(List.class, result);
        
    }
    @Test
    public void testCalcularMedia() {

        List<Integer> numeros = Arrays.asList(8, 9, 10, 7, 9, 8);
        List<Integer> numerosVacio = Arrays.asList();
        List<Integer> numerosNull = Arrays.asList(null, null, null);
        double result = example.calcularMedia(numeros);        
        assertEquals(8.5, result, "La media debe ser 8.5");
        assertTrue(result > 8);
        assertFalse(result > 9);
        assertInstanceOf(Double.class, result);
        assertThrows(IllegalArgumentException.class, () ->example.calcularMedia(numerosVacio), "Debe lanzar excepción para lista vacia");
        assertThrows(NullPointerException.class, () ->example.calcularMedia(numerosNull), "Debe lanzar excepción para lista nula");
       

    } 
    
    @Test
    public void testConvertirListaAString() {
        List<String> lista = Arrays.asList("uno", "dos", "tres");
        String result = example.convertirListaAString(lista);
        List<String> listaConNull = Arrays.asList("uno", null, "tres");
        String resultConNull = example.convertirListaAString(listaConNull);
        List<String> listaVacia = Arrays.asList();
        String resultVacia= example.convertirListaAString(listaVacia);
        List<String> listaMayusculas = Arrays.asList("UNO", "DOS", "TRES");
        String resultMay = example.convertirListaAString(listaMayusculas);
        List<String> listaConNulls = Arrays.asList(null, null, null);
        String resultConNulls = example.convertirListaAString(listaConNulls);
        List<String> listaMixta = Arrays.asList("uno", "DOS", null, "tres");
        String resultMix = example.convertirListaAString(listaMixta);
       

        assertEquals("UNO,DOS,TRES", result, "Debe convertir las cadenas a mayúsculas y concatenarlas.");
        assertEquals("UNO,NULL,TRES", resultConNull, "Debe reemplazar null con 'NULL' y convertir a mayúsculas.");
        assertEquals("", resultVacia, "La lista vacía debe devolver una cadena vacía.");
        assertEquals("UNO,DOS,TRES", resultMay, "Debe mantener las cadenas ya en mayúsculas.");
        assertEquals("NULL,NULL,NULL", resultConNulls, "Debe convertir todos los valores null a 'NULL'.");
        assertEquals("UNO,DOS,NULL,TRES", resultMix, "Debe manejar valores mixtos de cadenas y null correctamente.");
        assertInstanceOf(String.class, result);
        assertInstanceOf(String.class, resultConNull);
        assertInstanceOf(String.class, resultConNulls);
        assertInstanceOf(String.class, resultMay);
        assertInstanceOf(String.class, resultMix);
        assertInstanceOf(String.class, resultVacia);
        
    }
}    
   
