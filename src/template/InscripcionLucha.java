package template;

public class InscripcionLucha extends InscripcionTorneo {

    private final Polideportivo polideportivo;

    public InscripcionLucha(Polideportivo polideportivo) {
        super(new Torneo("torneo lucha"));
        this.polideportivo = polideportivo;
    }

    @Override
    protected boolean puedeApuntarse(Solicitud solicitud) {
        if (solicitud.getEdat() < 15) {
            return false;
        }

        if (solicitud.getPeso() < 60) {
            return false;
        }
        return true;
    }

    @Override
    protected void cierraTorneo() {
        System.out.println("Cerrando torneo: " + torneo.getNombre());
        polideportivo.reserva(torneo, 4); // Ajustar las horas según sea necesario
    }

    @Override
    protected int maximoPartipantes() {
        return 6;
    }
}
