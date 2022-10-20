package semana_1.c4.mesa;

public class AnalistaEnvase extends AnalistaDeCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
        if(articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")){
            return "Articulo autorizado. FIN";
        } else {
            return "El articulo fue rechazado. Ta rompido.";
        }
    }
}
