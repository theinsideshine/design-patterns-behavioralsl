package chain.responsability.example;

import chain.responsability.Maquina;

public class ChainRApp {

    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.aceptarMoneda(1); // Salida esperada: Se ha aceptado una moneda de 5 pesos.
        maquina.aceptarMoneda(10); // Salida esperada: No se puede manejar la moneda.
    }
}
