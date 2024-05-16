package chain.responsability;

// Implementación concreta de manejo de monedas de 1 peso
public class ManejadorMoneda1Peso implements ManejadorMoneda {
    private ManejadorMoneda siguiente;

    @Override
    public void manejarMoneda(int monto) {
        if (monto == 1) {
            System.out.println("Se ha aceptado una moneda de 1 peso.");
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



