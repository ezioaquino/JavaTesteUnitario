package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BancoTest {
    @Test
    public void bancosIguais(){
        Banco b1 = new Banco(1);
        Banco b2 = new Banco(1);
        Assertions.assertEquals(b1,b2);
    }
    @Test
    public void bancosDiferentes(){
        Banco b1 = new Banco(1);
        Banco b2 = new Banco(2);
        Assertions.assertNotEquals(b1,b2);
    }

}
