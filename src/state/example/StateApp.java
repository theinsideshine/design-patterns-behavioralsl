package state.example;

import state.Horno;

public class StateApp {

    public static void main(String[] args) {
        Horno horno = new Horno();

        // Ejemplo de uso
        horno.encender();
        horno.aumentarPotencia();
        horno.iniciarCocinado();
        horno.abrirPuerta();
        horno.cerrarPuerta();
        horno.apagar();
    }
}
