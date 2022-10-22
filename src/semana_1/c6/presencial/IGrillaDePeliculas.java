package semana_1.c6.presencial;

public interface IGrillaDePeliculas {
    Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException;
}
