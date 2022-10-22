package semana_1.c5.mesa;

public class ServicioDescarga implements ServicioInterface {

    @Override
    public String descargar(Usuario usuario) {
        System.out.println("Se está descargando la canción");
        return "Se descargó la canción";
    }
}
