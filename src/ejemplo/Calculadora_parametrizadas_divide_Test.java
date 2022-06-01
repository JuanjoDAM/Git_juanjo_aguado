package ejemplo;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Calculadora_parametrizadas_divide_Test {
    private int nume1;
    private int nume2;
    private int resul;

    public Calculadora_parametrizadas_divide_Test(int nume1, int nume2, int resul) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.resul = resul; // resultado de la operaci�n
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][] { { 20, 10, 2 }, { 30, -2, -15 }, { 5, 2, 3 } });
    }

    /*
    public static Integer[][] numeros() {
        Integer[][] n = { { 20, 10, 2 }, { 30, -2, -15 }, { 5, 2, 3 } };
        return n;
    }
    */

    @Test
    public void testDivide() {
        Calculadora_parametrizadas calcu = new Calculadora_parametrizadas(nume1, nume2);
        int resultado = calcu.divide();
        assertEquals(resul, resultado);

    }

}
