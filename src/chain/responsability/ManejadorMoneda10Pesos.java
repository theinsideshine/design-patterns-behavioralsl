package chain.responsability;

// Implementación concreta de manejo de monedas de 10 pesos
public class ManejadorMoneda10Pesos implements ManejadorMoneda {
    private ManejadorMoneda siguiente;

    @Override
    public void manejarMoneda(int monto) {
        if (monto == 10) {
            System.out.println("Se ha aceptado una moneda de 10 pesos.");
        } else if (siguiente != null) {
            siguiente.manejarMoneda(monto);
        } else {
            System.out.println("No se puede manejar la moneda de " + monto + " peso(s).");
        }
    }

    @Override
    public void setSiguiente(ManejadorMoneda siguiente) {
        this.siguiente = siguiente;
    }
}