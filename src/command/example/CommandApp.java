package command.example;

import command.*;
import command.pedido.PedidoInternacional;
import command.pedido.PedidoPeligroso;
import command.pedido.PedidoPeligrosoImpl;
import command.tratamiento.TratamientoPedido;
import command.tratamiento.TratamientoPedidoInternacional;
import command.tratamiento.TratamientoPedidoMultiple;
import command.tratamiento.TratamientoPedidoPeligroso;

import java.util.Arrays;

public class CommandApp {

    public static void main(String[] args) {
        // Crear pedidos
        PedidoInternacional pedido1 = new PedidoInternacional("Gondor", 50);
        PedidoInternacional pedido2 = new PedidoInternacional("Mordor", 60);

        PedidoPeligroso pedidoPeligroso = new PedidoPeligrosoImpl(30, "Handle with care: Explosives");

        // Crear tratamientos de pedidos
        TratamientoPedido tratamiento1 = new TratamientoPedidoInternacional(pedido1);
        TratamientoPedido tratamiento2 = new TratamientoPedidoInternacional(pedido2);
        TratamientoPedido tratamientoPeligroso = new TratamientoPedidoPeligroso(pedidoPeligroso);

        // Crear un tratamiento múltiple
        TratamientoPedidoMultiple tratamientoMultiple = new TratamientoPedidoMultiple(
                Arrays.asList(tratamiento1, tratamiento2, tratamientoPeligroso)
        );

        // Crear oficina y procesar pedidos
        Oficina oficina = new Oficina();
        oficina.recibe(tratamiento1);
        oficina.recibe(tratamiento2);
        oficina.recibe(tratamientoPeligroso);
        oficina.recibe(tratamientoMultiple);
    }
}
