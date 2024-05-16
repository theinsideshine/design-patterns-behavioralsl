package command;


import command.tratamiento.TratamientoPedido;

public class Oficina {

    public void recibe(TratamientoPedido pedido) {
        System.out.println("Registrando pedido...");

        boolean ok = pedido.tratar();

        if (ok) {
            System.out.println("El pedido ha sido registrado exitosamente.");
        } else {
            System.out.println("El registro del pedido ha fallado.");
        }
    }
}
