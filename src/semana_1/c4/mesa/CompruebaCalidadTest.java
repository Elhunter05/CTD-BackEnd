package semana_1.c4.mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.CompositeRowProcessor;

public class CompruebaCalidadTest {
    @Test
    public void autorizacionDeArticulo(){
        Articulo articulo = new Articulo("Tubos de acero", 1000, 1300, "casi sano");
        CompruebaCalidad gestorCalidad = new CompruebaCalidad(articulo);
        String respEsperada = "Articulo autorizado. FIN";

        String gestionCalidad = gestorCalidad.validarCalidadProducto(articulo);

        Assertions.assertEquals(respEsperada, gestionCalidad);
    }

    @Test
    public void rechazoDeArticuloRoto(){
        Articulo articulo = new Articulo("Bolsas de cemento", 1100, 1200, "agujereadas");
        CompruebaCalidad gestorCalidad = new CompruebaCalidad(articulo);
        String respEsperada = "El articulo fue rechazado. Ta rompido.";

        String gestionCalidad = gestorCalidad.validarCalidadProducto(articulo);

        Assertions.assertEquals(respEsperada, gestionCalidad);
    }

    @Test
    public void articuloRechazadoPorPeso(){
        Articulo articulo = new Articulo("Almohadas", 1300, 300, "sano");
        CompruebaCalidad gestorCalidad = new CompruebaCalidad(articulo);
        String respEsperada = "El articulo fue rechazado. Peso fuera de rango.";

        String gestionCalidad = gestorCalidad.validarCalidadProducto(articulo);

        Assertions.assertEquals(respEsperada, gestionCalidad);
    }

    @Test
    public void articuloRechazadoPorLote(){
        Articulo articulo = new Articulo("clavos", 15000, 1300, "sano");
        CompruebaCalidad gestorCalidad = new CompruebaCalidad(articulo);
        String respEsperada = "El articulo fue rechazado. Lote fuera de rango.";

        String gestionCalidad = gestorCalidad.validarCalidadProducto(articulo);

        Assertions.assertEquals(respEsperada, gestionCalidad);
    }
}
