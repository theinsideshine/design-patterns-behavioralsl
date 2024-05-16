package chain.responsability;

// Implementación concreta de manejo de monedas de 5 pesos
public class ManejadorMoneda5Pesos implements ManejadorMoneda {
    private ManejadorMoneda siguiente;

    @Override
    public void manejarMoneda(int monto) {
        if (monto == 5) {
            System.out.println("Se ha aceptado una moneda de 5 pesos.");
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
