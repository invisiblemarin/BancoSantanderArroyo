package com.company;

public class CajaDeAhorro extends Cuenta{

    private Double tazaInteres;

    public CajaDeAhorro(Cliente unCliente){
        super(unCliente);
        tazaInteres = 10.;
    }

    public void cobrarInteres(){
    }


}
