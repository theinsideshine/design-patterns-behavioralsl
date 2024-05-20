package template;

public abstract class InscripcionTorneo {

    protected final Torneo torneo;

    public InscripcionTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public boolean apunta(Solicitud solicitud) {
        if (!puedeApuntarse(solicitud)) {
            System.out.println("Solicitud rechazada: " + solicitud.getNombre() + " no cumple los requisitos.");
            return false;
        }

        if (torneo.getAceptadas().size() >= maximoPartipantes()) {
            System.out.println("Solicitud rechazada: " + solicitud.getNombre() + " porque el torneo está lleno.");
            return false;
        }

        torneo.apunta(solicitud);
        System.out.println("Solicitud aceptada: " + solicitud.getNombre());

        if (torneo.getAceptadas().size() >= maximoPartipantes()) {
            System.out.println("Cerrando torneo debido a máximo de participantes alcanzado.");
            cierraTorneo(); // Aquí se llama a cierraTorneo
        }

        return true;
    }

    protected abstract boolean puedeApuntarse(Solicitud solicitud);

    protected abstract int maximoPartipantes();

    protected abstract void cierraTorneo();
}
