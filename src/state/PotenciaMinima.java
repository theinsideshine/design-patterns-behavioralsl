package state;

public class PotenciaMinima implements EstadoHorno {
    private Horno horno;

    public PotenciaMinima(Horno horno) {
        this.horno = horno;
    }

    @Override
    public void abrirPuerta() {
        System.out.println("No se puede abrir la puerta mientras el horno está funcionando.");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("No se puede cerrar la puerta mientras el horno está funcionando.");
    }

    @Override
    public void encender() {
        System.out.println("El horno ya está encendido y en potencia mínima.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el horno.");
        horno.cambiarEstado(new Apagado(horno));
    }

    @Override
    public void aumentarPotencia() {
        System.out.println("Aumentando la potencia del horno.");
        horno.cambiarEstado(new Cocinando(horno));
    }

    @Override
    public void disminuirPotencia() {
        System.out.println("El horno ya está en potencia mínima.");
    }

    @Override
    public void iniciarCocinado() {
        System.out.println("Iniciando el cocinado en potencia mínima.");
        // Lógica para iniciar el cocinado
    }
}

