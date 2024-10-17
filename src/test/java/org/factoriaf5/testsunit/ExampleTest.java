package org.factoriaf5.testsunit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
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
        boolean result0 = example.checkPositivo(0);

        assertTrue(result, "10 es un número positivo");
        assertTrue(result0, "0 debe ser considerado positivo");
        assertNotNull(result);
        assertInstanceOf(Boolean.class, result);
        
    }

    @Test
    public void testCheckNegativo() {       

        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(-5));
      
               
    }


    @Test
    public void testContarLetrasA() {

        String palabra="sapo";
        int result= example.contarLetrasA(palabra);
        

        assertEquals(1, result,"Debe contar una letras 'a'");
        assertTrue(result > 0);
        assertFalse(result > 1);
        assertInstanceOf(Integer.class, result);
        

    }

    @Test
    public void testContarLetrasANinguna() {

        String palabra="sonido";
        int result= example.contarLetrasA(palabra);
        
        assertEquals(0, result,"Debe contar letras 0 porque no las hay");
        assertTrue(result >-1);
        assertFalse(result > 0);
        assertInstanceOf(Integer.class, result);        

    }

    @Test
    public void testContarVariasLetrasA() {
        
        String palabra = "manzana";
        int result = example.contarLetrasA(palabra);
                
        assertEquals(3, result, "Debe contar exactamente tres letras 'a'.");        
        assertTrue(result > 1);
        assertFalse(result > 3);
        assertInstanceOf(Integer.class, result);
       

    }

    @Test
    public void testContarLetrasAVacia() {

        String palabra = "";
        int result = example.contarLetrasA(palabra);

        assertEquals(0, result, "La cadena vacía debe tener 0 letras 'a'");      
        assertTrue(result > -1);
        assertFalse(result > 0);
        assertInstanceOf(Integer.class, result);
       

    }
        

    @Test
    public void testContarLetrasACaracteres() {

        String palabra = "a@123 a";
        int result= example.contarLetrasA(palabra);

        assertEquals(2, result, "Debe contar correctamente las letras 'a' sin importar los caracteres especiales.");
        assertTrue(result > 1);
        assertFalse(result > 2);
        assertInstanceOf(Integer.class, result);
      

    }

    @Test
    public void testContarLetrasANull(){

        assertThrows(NullPointerException.class, () -> example.contarLetrasA(null), "Debe lanzar excepción si la cadena es nula");

    }

    @Test
    public void testContieneElemento_ElementoExiste() {
        
        List<String> frutas = Arrays.asList("manzana", "naranja", "plátano","limon","pera");
        boolean result = example.contieneElemento(frutas, "pera");

        assertTrue(result, "La lista debe contener 'pera'");
        assertInstanceOf(Boolean.class, result);
    }

    @Test
    public void testContieneElemento_ElementoNoExiste() {
        
        List<String> frutas = Arrays.asList("manzana", "naranja", "plátano","limon","pera");
        boolean result = example.contieneElemento(frutas, "uva");

        assertFalse(result, "La lista no debe contener 'uva'");
        assertInstanceOf(Boolean.class, result);
        
    }

    @Test
    public void testContieneElemento_ListaVacia() {
        
        List<String> frutas = Arrays.asList();
        boolean result = example.contieneElemento(frutas, "limon");

        assertFalse(result, "Una lista vacía no debe contener ningún elemento");  
        assertInstanceOf(Boolean.class, result);      
    }

    @Test
    public void testContieneElemento_ElementoNull() {
       
        List<String> frutas = Arrays.asList("manzana", "naranja", "plátano","limon","pera");
        boolean result = example.contieneElemento(frutas,null);

        assertFalse(result, "La lista no debe contener un elemento nulo"); 
        assertInstanceOf(Boolean.class, result);
    }

   
   
    @Test
    public void testRevertirCadena() {
        
        String palabra="gato";
        String result= example.revertirCadena(palabra);

        assertEquals("otag", result);
        assertInstanceOf(String.class, result);
    }

    @Test
    public void testRevertirCadenaVacia() {
        
        String palabra="";
        String result= example.revertirCadena(palabra);

        assertEquals("", result, "La cadena vacía debe seguir vacía");
        assertInstanceOf(String.class, result);

        
    }

    @Test
    public void testRevertirCadenaNula() {
                
        assertThrows(NullPointerException.class, () -> example.revertirCadena(null), "Debería lanzar una excepción si la cadena es nula");
    
        
    }

    @Test
    public void testFactorialCero() {

        int numero = 0;
        long result = example.factorial(numero);
        assertEquals(1, result, "El factorial de 0 debe ser 1");
        assertNotNull(result);
        assertInstanceOf(Long.class, result);
       
    }

    @Test
    public void testFactorialPositivo() {

        int numero = 5;
        long result = example.factorial(numero);
        assertEquals(120, result, "El factorial de 5 debe ser 120");
        assertNotNull(result);
        assertInstanceOf(Long.class, result);
    }

    @Test
    public void testFactorialNumeroGrande() {
        
        int numero = 10;
        long result =example.factorial(numero);
        assertEquals(3628800, result, "El factorial de 10 debe ser 3628800");
        assertNotNull(result);
        assertInstanceOf(Long.class, result);
    }

    @Test
    public void testFactorialNumeroNegativo() {
       
        assertThrows(IllegalArgumentException.class, () -> {example.factorial(-5);}, "Debe lanzar excepcion para número negativo");
    }

    
    @Test
    public void testNumeroPrimo() {
       
        assertTrue(example.esPrimo(5), "El número 5 debe ser primo");
    }

    @Test
    public void testNumeroNoPrimo() {
        
        assertFalse(example.esPrimo(4), "El número 4 no debe ser primo");
    }

    @Test
    public void testNumeroCero() {
       
        assertFalse(example.esPrimo(0), "El número 0 no debe ser primo");
    }

    @Test
    public void testNumeroUno() {
       
        assertFalse(example.esPrimo(1), "El número 1 no debe ser primo");
    }

    @Test
    public void testNumeroNegativo() {
        
        assertFalse(example.esPrimo(-7), "Los números negativos no son primos");
    }

    @Test
    public void testNumeroPrimoGrande() {
       
        assertTrue(example.esPrimo(101), "El número 101 debe ser primo");
    }

    @Test
    public void testNumeroNoPrimoGrande() {
       
        assertFalse(example.esPrimo(100), "El número 100 no debe ser primo");
    }

    @Test
    public void testMensajeConRetrasoDentroRango() throws InterruptedException {

            String result = example.mensajeConRetraso();  

            assertEquals("Listo después de retraso", result, "El resultado es el esperado.");
            assertNotNull(result);
            assertInstanceOf(String.class, result);
    }

    @Test
    public void testMensajeConRetrasoFueraRango() throws InterruptedException {

            long startTime = System.currentTimeMillis();                            
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            String result = example.mensajeConRetraso();  

            assertFalse(elapsedTime >= 5000 && elapsedTime < 6000, "El tiempo de ejecución no está dentro del rango esperado.");
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
    public void testConvertirListaVacia() {
        
        List<Integer> numeros = Arrays.asList();
        List<String> result = example.convertirAString(numeros);
        List<String> resultExpected = Arrays.asList();
        assertEquals(resultExpected,result, "Una lista vacía no debe contener ningún elemento");  
        assertNotNull(result);
        assertInstanceOf(List.class, result);
        
    }

    @Test
    public void testConvertirListaConUnSoloElemento() {
        
        List<Integer> numeros = Arrays.asList(42);
        List<String> result = example.convertirAString(numeros);
        List<String> resultExpected = Arrays.asList("42");
        assertEquals(resultExpected, result, "La lista con un solo número debe convertirse correctamente");
        assertNotNull(result);
        assertInstanceOf(List.class, result);
    }

    @Test
    public void testConvertirListaConNumerosNegativos() {
       
        List<Integer> numeros = Arrays.asList(-10, -20, -30);
        List<String> result = example.convertirAString(numeros);       
        List<String> resultExpected = Arrays.asList("-10", "-20", "-30");
        assertEquals(resultExpected, result, "La lista debe manejar números negativos correctamente");
    }

    @Test
    public void testCalcularMedia() {

        List<Integer> numeros = Arrays.asList(8, 9, 10, 7, 9, 8);
        double result = example.calcularMedia(numeros); 

        assertEquals(8.5, result, "La media debe ser 8.5");
        assertTrue(result > 8);
        assertFalse(result > 9);
        assertInstanceOf(Double.class, result);
     

    } 

    @Test
    public void testCalcularMediaVacio() {

        List<Integer> numeros = Arrays.asList();               
        
        assertThrows(IllegalArgumentException.class, () ->example.calcularMedia(numeros), "Debe lanzar excepción para lista vacia");
        
    } 

    @Test
    public void testCalcularMediaNull() {

      
        assertThrows(IllegalArgumentException.class, () ->example.calcularMedia(null), "Debe lanzar excepción para lista nula");
       

    } 
    
    @Test
    public void testConvertirListaAString() {
        List<String> lista = Arrays.asList("uno", "dos", "tres");
        String result = example.convertirListaAString(lista);
             
        assertEquals("UNO,DOS,TRES", result, "Debe convertir las cadenas a mayúsculas y concatenarlas.");
        assertInstanceOf(String.class, result);
      
        
    }

    @Test
    public void testConvertirListaAStringConNull() {
        List<String> lista = Arrays.asList("uno", null, "tres");
        String result = example.convertirListaAString(lista);
        
              
        assertEquals("UNO,NULL,TRES", result, "Debe reemplazar null con 'NULL' y convertir a mayúsculas.");
        assertInstanceOf(String.class, result);
     
    }

    @Test
    public void testConvertirListaAStringVacia() {
       
        List<String> lista = Arrays.asList();
        String result= example.convertirListaAString(lista);       
               
        assertEquals("", result, "La lista vacía debe devolver una cadena vacía.");
        assertInstanceOf(String.class, result);
        
    }

    @Test
    public void testConvertirListaAStringMay() {
        
        List<String> lista = Arrays.asList("UNO", "DOS", "TRES");
        String result = example.convertirListaAString(lista);

        assertEquals("UNO,DOS,TRES", result, "Debe mantener las cadenas ya en mayúsculas.");
        assertInstanceOf(String.class, result);

 
        
    }

    @Test
    public void testConvertirListaAStringNula() {
       
        List<String> lista = Arrays.asList(null, null, null);
        String result = example.convertirListaAString(lista);

        assertEquals("NULL,NULL,NULL", result, "Debe convertir todos los valores null a 'NULL'.");
    
        
    }

    @Test
    public void testConvertirListaAStringMixta() {
       
        List<String> lista = Arrays.asList("uno", "DOS", null, "tres");
        String result = example.convertirListaAString(lista);
           
        assertEquals("UNO,DOS,NULL,TRES", result, "Debe manejar valores mixtos de cadenas y null correctamente.");
        assertInstanceOf(String.class, result);
      
        
    }
}    
   
    
    

