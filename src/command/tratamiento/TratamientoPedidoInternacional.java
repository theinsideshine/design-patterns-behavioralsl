package command.tratamiento;


import command.pedido.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        if ("Mordor".equals(pedido.getDestino())) {
            System.out.println("Fallo: El destino es Mordor, no se puede enviar el pedido.");
            return false;
        }
        return true;
    }
}

