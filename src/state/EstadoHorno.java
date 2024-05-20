package state;

public interface EstadoHorno {
    void abrirPuerta();
    void cerrarPuerta();
    void encender();
    void apagar();
    void aumentarPotencia();
    void disminuirPotencia();
    void iniciarCocinado();
}

