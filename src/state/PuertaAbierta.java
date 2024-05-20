package state;

public class PuertaAbierta implements EstadoHorno {
    private Horno horno;

    public PuertaAbierta(Horno horno) {
        this.horno = horno;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("La puerta ya está abierta.");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("Cerrando la puerta.");
        horno.cambiarEstado(new Apagado(horno));
    }

    @Override
    public void encender() {
        System.out.println("No se puede encender con la puerta abierta.");
    }

    @Override
    public void apagar() {
        System.out.println("El horno está apagado.");
    }

    @Override
    public void aumentarPotencia() {
        System.out.println("No se puede ajustar la potencia con la puerta abierta.");
    }

    @Override
    public void disminuirPotencia() {
        System.out.println("No se puede ajustar la potencia con la puerta abierta.");
    }

    @Override
    public void iniciarCocinado() {
        System.out.println("La puerta debe estar cerrada para iniciar el cocinado.");
    }
}

