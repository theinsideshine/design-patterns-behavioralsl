package mediator;





public class Coordinador implements Mediator {

    private Telefono telefono;
    private Coche coche;
    private Radio radio;

    public Coordinador(Telefono telefono, Coche coche, Radio radio) {
        this.telefono = telefono;
        this.coche = coche;
        this.radio = radio;
        this.telefono.setMediator(this);
        this.coche.setMediator(this);
        this.radio.setMediator(this);
    }

    @Override
    public void notificar(Object remitente, String evento) {
        System.out.println("Notificación recibida. Remitente: " + remitente.getClass().getSimpleName() + ", Evento: " + evento);

        if (remitente instanceof Coche && evento.equals("enciende")) {
            radio.enciende();
            telefono.apagaMusica();
        } else if (remitente instanceof Coche && evento.equals("apaga")) {
            radio.apaga();
        } else if (remitente instanceof Radio && evento.equals("enciende")) {
            telefono.apagaMusica();
        } else if (remitente instanceof Telefono && evento.equals("recibeLlamada")) {
            radio.apaga();
        }
    }
}
