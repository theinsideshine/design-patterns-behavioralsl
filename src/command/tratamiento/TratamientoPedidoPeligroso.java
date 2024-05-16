package command.tratamiento;


import command.pedido.PedidoPeligroso;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        System.out.println("Tratando pedido peligroso con instrucciones: " + pedido.instrucciones());
        // Implementar la lógica real para el tratamiento del pedido peligroso
        return true; // Implementar lógica real para determinar el éxito o fracaso
    }
}
