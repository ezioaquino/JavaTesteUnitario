package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {


    @Test
    public void somarNumerosNegativos(){
        Calculadora calc = new Calculadora();

        int somar = calc.somar(-1,-1);
        //assertTrue(somar ==0);
        Assertions.assertEquals(-2,somar);
        System.out.println(somar);
    }
}
