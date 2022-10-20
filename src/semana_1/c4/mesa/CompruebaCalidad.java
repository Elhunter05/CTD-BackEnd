package semana_1.c4.mesa;

public class CompruebaCalidad {
    private AnalistaDeCalidad cadena;

    public CompruebaCalidad(Articulo articulo){
        cadena = new AnalistaLote();
        AnalistaDeCalidad analistaPeso = new AnalistaPeso();
        AnalistaDeCalidad analistaEnvase = new AnalistaEnvase();
        cadena.setSiguienteAnalista(analistaPeso);
        analistaPeso.setSiguienteAnalista(analistaEnvase);
    }

    public String validarCalidadProducto(Articulo articulo){
        return cadena.comprobarArticulo(articulo);
    }
}
