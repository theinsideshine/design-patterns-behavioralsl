package state;

public class Cocinando implements EstadoHorno {
    private Horno horno;

    public Cocinando(Horno horno) {
        this.horno = horno;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("No se puede abrir la puerta durante el cocinado.");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("La puerta ya está cerrada.");
    }

    @Override
    public void encender() {
        System.out.println("El horno ya está encendido y cocinando.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el horno.");
        horno.cambiarEstado(new Apagado(horno));
    }

    @Override
    public void aumentarPotencia() {
        System.out.println("El horno ya está en potencia máxima.");
    }

    @Override
    public void disminuirPotencia() {
        System.out.println("El horno ya está en potencia mínima.");
    }

    @Override
    public void iniciarCocinado() {
        System.out.println("El horno ya está cocinando.");
    }
}
