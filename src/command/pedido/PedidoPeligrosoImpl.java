package command.pedido;

public class PedidoPeligrosoImpl implements PedidoPeligroso {

    private int peso;
    private String instrucciones;

    public PedidoPeligrosoImpl(int peso, String instrucciones) {
        this.peso = peso;
        this.instrucciones = instrucciones;
    }

    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String instrucciones() {
        return instrucciones;
    }
}
