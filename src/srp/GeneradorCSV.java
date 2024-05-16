package srp;



import java.util.List;

public class GeneradorCSV {

    public String generarCSV(List<Pelicula> peliculas) {
        StringBuilder sb = new StringBuilder();
        for (Pelicula pelicula : peliculas) {
            sb.append(pelicula.getTitulo()).append(",").append(pelicula.getDirector()).append(",").append(pelicula.getGenero()).append("\n");
        }
        return sb.toString();
    }
}
