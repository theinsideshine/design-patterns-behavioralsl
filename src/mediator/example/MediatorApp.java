package mediator.example;

import mediator.Coche;
import mediator.Coordinador;
import mediator.Radio;
import mediator.Telefono;

public class MediatorApp {


    public static void main(String[] args) {
        // Crear instancias de Telefono, Coche y Radio
        Telefono telefono = new Telefono();
        Coche coche = new Coche();
        Radio radio = new Radio();

        // Crear el Coordinador y asociarlo con Telefono, Coche y Radio
        Coordinador coordinador = new Coordinador(telefono, coche, radio);

        // Simular las interacciones
        System.out.println("Enciendo el coche:");
        coche.enciende();
        System.out.println("Radio encendida: " + radio.encendida());
        System.out.println("Musica en el teléfono: " + telefono.musicaEncendida());

        System.out.println("\nEl teléfono recibe una llamada:");
        telefono.recibeLlamada();
        System.out.println("Radio encendida: " + radio.encendida());

        System.out.println("\nApago el coche:");
        coche.apaga();
        System.out.println("Radio encendida: " + radio.encendida());

        System.out.println("\nEnciendo la radio directamente:");
        radio.enciende();
        System.out.println("Radio encendida: " + radio.encendida());
        System.out.println("Musica en el teléfono: " + telefono.musicaEncendida());
    }
}
