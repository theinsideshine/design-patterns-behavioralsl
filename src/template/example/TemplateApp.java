package template.example;



import template.*;

import java.util.Map;

public class TemplateApp {

    public static void main(String[] args) {
        // Crear un polideportivo
        Polideportivo polideportivo = new Polideportivo();

        // Crear instancias de InscripcionLucha e InscripcionTenis
        InscripcionTorneo inscripcionLucha = new InscripcionLucha(polideportivo);
        InscripcionTorneo inscripcionTenis = new InscripcionTenis(polideportivo);

        // Crear algunas solicitudes para probar
        Solicitud solicitud1 = new Solicitud("Juan", 20, 70); // Válido para lucha
        Solicitud solicitud2 = new Solicitud("Maria", 12, 55); // No válido para lucha
        Solicitud solicitud3 = new Solicitud("Pedro", 8, 45); // No válido para tenis
        Solicitud solicitud4 = new Solicitud("Ana", 15, 65); // Válido para tenis
        Solicitud solicitud5 = new Solicitud("Carlos", 18, 75); // Válido para lucha
        Solicitud solicitud6 = new Solicitud("Laura", 25, 65); // Válido para lucha
        Solicitud solicitud7 = new Solicitud("Luis", 30, 80); // Válido para lucha
        Solicitud solicitud8 = new Solicitud("Elena", 28, 68); // Válido para lucha
        Solicitud solicitud9 = new Solicitud("Sol", 15, 65); // Válido para tenis

        // Probar la inscripción
        System.out.println("Inscribiendo para lucha:");
        System.out.println("Juan: " + inscripcionLucha.apunta(solicitud1));
        System.out.println("Maria: " + inscripcionLucha.apunta(solicitud2));
        System.out.println("Pedro: " + inscripcionLucha.apunta(solicitud3));
        System.out.println("Ana: " + inscripcionLucha.apunta(solicitud4));
        System.out.println("Carlos: " + inscripcionLucha.apunta(solicitud5));
        System.out.println("Laura: " + inscripcionLucha.apunta(solicitud6));
        System.out.println("Luis: " + inscripcionLucha.apunta(solicitud7));
        System.out.println("Elena: " + inscripcionLucha.apunta(solicitud8));

        System.out.println("\nInscribiendo para tenis:");
        System.out.println("Juan: " + inscripcionTenis.apunta(solicitud1));
        System.out.println("Maria: " + inscripcionTenis.apunta(solicitud2));
        System.out.println("Pedro: " + inscripcionTenis.apunta(solicitud3));
        System.out.println("Ana: " + inscripcionTenis.apunta(solicitud4));
        System.out.println("Sol: " + inscripcionTenis.apunta(solicitud9));



        // Mostrar las reservas en el polideportivo
        System.out.println("\nReservas en el polideportivo:");
        for (Map.Entry<Torneo, Integer> entry : polideportivo.getReservas().entrySet()) {
            System.out.println("Torneo: " + entry.getKey().getNombre() + ", Horas: " + entry.getValue());
        }
    }
}
