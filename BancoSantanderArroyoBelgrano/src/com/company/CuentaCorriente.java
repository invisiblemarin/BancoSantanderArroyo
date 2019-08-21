package com.company;

public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Cliente unCliente){
        super(unCliente);
        montoAutorizado = 2000.;
    }

    public void extraer(Double platita){
        if(platita <= getSaldo() + montoAutorizado)
        super.extraer(platita);
    }

}
