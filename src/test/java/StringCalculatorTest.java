import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculatorString = new StringCalculator();

    @Test
    void cadenaVaciaTest() throws Exception{
        int result = calculatorString.add("");
        assertEquals(0, result);
    }
    @Test
    void cadenaConNumeroTest() throws Exception{
        int result = calculatorString.add("5");
        assertEquals(5, result);

    }@Test
    void cadenaConDosNumeroTest() throws Exception{
        int result = calculatorString.sumaNumerosPorComaOSalto("5,8");
        assertEquals(13, result);
    }

    @Test
    public void cadenaConDosNumeroPorSaltoTest() throws Exception{
        int resultado = calculatorString.sumaNumerosPorComaOSalto("10\n2");
        assertEquals(12, resultado);
    }

    @Test
    public void separarYSumarTest() throws Exception{
        int result = calculatorString.separarYSumar("3&2&3","&");
        assertEquals(8, result);
    }

    @Test
    public void separarYSumarVariosDelimitadoresTest() throws Exception{
        int result = calculatorString.separarYSumar("5&&6&&3","&&");
        assertEquals(14, result);
    }

    @Test
    void exceptionNegativeTesting() {
        Exception thrown = assertThrows(Exception.class, () ->
                calculatorString.add("-1"));
        assertEquals("No se puede sumar porque es negativo", thrown.getMessage());
    }

    @Test
    void exceptionThousandTesting() {
        Exception thrown = assertThrows(Exception.class, () ->
                calculatorString.add("1001"));
        assertEquals("El valor es mayor a mil ", thrown.getMessage());
    }


}