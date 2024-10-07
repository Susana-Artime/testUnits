public class ExampleTest {

    @Test
    public void testSumar() {
        //Example example =  new Example(); crear el objecto example
        // Given - Teniendo
        int num1 = 35; // parametros
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
    
}
