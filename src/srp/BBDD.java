package srp;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BBDD {

    public static final String DIRECTOR_SPIELBERG = "Spielberg";

    public static final Pelicula ET = new Pelicula("ET", "fantastica", DIRECTOR_SPIELBERG);
    public static final Pelicula SOLDADO_RYAN = new Pelicula("Salvar al soldado Ryan", "belico", DIRECTOR_SPIELBERG);

    public static final Pelicula[] TODAS = {ET, SOLDADO_RYAN};

    public static final Cliente JUAN = new Cliente("Juan", ET);

    public static final Map<String, List<Pelicula>> PELIS_POR_DIRECTOR = Arrays.stream(TODAS)
            .collect(Collectors.groupingBy(Pelicula::getDirector));
}

