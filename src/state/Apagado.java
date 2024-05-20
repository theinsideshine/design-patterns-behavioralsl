package state;

public class Apagado implements EstadoHorno {
    private Horno horno;

    public Apagado(Horno horno) {
        this.horno = horno;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Abriendo la puerta.");
        horno.cambiarEstado(new PuertaAbierta(horno));
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("La puerta ya está cerrada.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el horno.");
        horno.cambiarEstado(new PotenciaMinima(horno));
    }

    @Override
    public void apagar() {
        System.out.println("El horno ya está apagado.");
    }

    @Override
    public void aumentarPotencia() {
        System.out.println("No se puede ajustar la potencia si el horno está apagado.");
    }

    @Override
    public void disminuirPotencia() {
        System.out.println("No se puede ajustar la potencia si el horno está apagado.");
    }

    @Override
    public void iniciarCocinado() {
        System.out.println("El horno está apagado. Enciéndelo para iniciar el cocinado.");
    }
}



