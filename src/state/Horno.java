package state;

public class Horno {
    private EstadoHorno estado;

    public Horno() {
        this.estado = new Apagado(this);
    }

    public void cambiarEstado(EstadoHorno estado) {
        this.estado = estado;
    }

    public void abrirPuerta() {
        estado.abrirPuerta();
    }

    public void cerrarPuerta() {
        estado.cerrarPuerta();
    }

    public void encender() {
        estado.encender();
    }

    public void apagar() {
        estado.apagar();
    }

    public void aumentarPotencia() {
        estado.aumentarPotencia();
    }

    public void disminuirPotencia() {
        estado.disminuirPotencia();
    }

    public void iniciarCocinado() {
        estado.iniciarCocinado();
    }
}

