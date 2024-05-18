package mediator;


public class Radio {

    private boolean encendida = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
        mediator.notificar(this, "enciende");
    }

    public void apaga() {
        encendida = false;
        mediator.notificar(this, "apaga");
    }

    public boolean encendida() {
        return encendida;
    }
}
