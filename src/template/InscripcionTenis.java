package template;

public class InscripcionTenis extends InscripcionTorneo {

    private final Polideportivo polideportivo;

    public InscripcionTenis(Polideportivo polideportivo) {
        super(new Torneo("torneo tenis"));
        this.polideportivo = polideportivo;
    }

    @Override
    protected boolean puedeApuntarse(Solicitud solicitud) {
        if (solicitud.getEdat() < 10) {
            return false;
        }

        return true;
    }

    @Override
    protected void cierraTorneo() {
        System.out.println("Cerrando torneo: " + torneo.getNombre());
        polideportivo.reserva(torneo, 8); // Ajustar las horas según sea necesario
    }

    @Override
    protected int maximoPartipantes() {
        return 4;
    }
}
