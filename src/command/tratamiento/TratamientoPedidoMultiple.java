package command.tratamiento;


import java.util.List;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private List<TratamientoPedido> tratamientos;

    public TratamientoPedidoMultiple(List<TratamientoPedido> tratamientos) {
        this.tratamientos = tratamientos;
    }

    @Override
    public boolean tratar() {
        for (TratamientoPedido tratamiento : tratamientos) {
            System.out.println("Tratando un pedido en el tratamiento múltiple...");
            if (!tratamiento.tratar()) {
                System.out.println("Un pedido en el tratamiento múltiple ha fallado.");
                return false;
            }
        }
        return true;
    }
}
