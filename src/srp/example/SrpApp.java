package srp.example;



import srp.*;

import java.util.List;

public class SrpApp {

    public static void main(String[] args) {
        Cliente cliente = BBDD.JUAN;

        // Generar recomendaciones
        Recomendador recomendador = new Recomendador();
        List<Pelicula> recomendaciones = recomendador.recomendaciones(cliente);

        // Mostrar recomendaciones
        System.out.println("Recomendaciones para " + cliente.getNombre() + ":");
        for (Pelicula recomendacion : recomendaciones) {
            System.out.println(recomendacion.getTitulo() + " - " + recomendacion.getDirector() + " - " + recomendacion.getGenero());
        }

        // Generar CSV de recomendaciones
        GeneradorCSV generadorCSV = new GeneradorCSV();
        String csv = generadorCSV.generarCSV(recomendaciones);

        // Mostrar CSV de recomendaciones
        System.out.println("\nCSV de recomendaciones:");
        System.out.println(csv);
    }
}
