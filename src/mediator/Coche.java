package mediator;




public class Coche {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.notificar(this, "enciende");
    }

    public void apaga() {
        mediator.notificar(this, "apaga");
    }
}
