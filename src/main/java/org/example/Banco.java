package org.example;

public class Banco {

    private Integer codigo;

    public Banco(Integer  codigo) {
        this.codigo = codigo;
    }

    public boolean igual(Banco banco){
        return this.codigo == banco.codigo;
    }

    @Override
    public boolean equals(Object obj) {
        Banco banco = (Banco) obj;
        return this.codigo.equals(banco.codigo);
    }
}
