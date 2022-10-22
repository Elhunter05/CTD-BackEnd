package semana_1.c5.mesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioDescargaTest {
    @Test
    public void comprobarServicioPremium() {

        ServicioProxy proxy = new ServicioProxy();
        Usuario jose = new Usuario("343", "premium");

        String respEsperada = "Se descargó la canción";
        String respActual = proxy.descargar(jose);

        assertEquals(respEsperada, respActual);
    }
    @Test
    public void comprobarServicioFree() {

        ServicioProxy proxy = new ServicioProxy();
        Usuario jose = new Usuario("343", "free");

        String respEsperada = "No puede acceder porque no es un usuario Premium";
        String respActual = proxy.descargar(jose);

        assertEquals(respEsperada, respActual);
    }
}