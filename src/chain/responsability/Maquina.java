package chain.responsability;

public class Maquina {
    private ManejadorMoneda manejadorMoneda;

    public Maquina() {
        // Configuración de la cadena de responsabilidad
        manejadorMoneda = new ManejadorMoneda1Peso();
        ManejadorMoneda manejadorMoneda5 = new ManejadorMoneda5Pesos();
        ManejadorMoneda manejadorMoneda10 = new ManejadorMoneda10Pesos();

        manejadorMoneda.setSiguiente(manejadorMoneda5);
        manejadorMoneda5.setSiguiente(manejadorMoneda10);
    }

    public void aceptarMoneda(int monto) {
        manejadorMoneda.manejarMoneda(monto);
    }
}
