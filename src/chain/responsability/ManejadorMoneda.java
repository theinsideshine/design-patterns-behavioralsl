package chain.responsability;

// Manejador abstracto
public interface ManejadorMoneda {
    void manejarMoneda(int monto);
    void setSiguiente(ManejadorMoneda siguiente);
}

