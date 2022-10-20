package semana_1.c4.mesa;

public class AnalistaLote extends AnalistaDeCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
        if(articulo.getLote() < 1000 || articulo.getLote() > 2000){
            return "El articulo fue rechazado. Lote fuera de rango.";
        } else {
            return this.getSiguienteAnalista().comprobarArticulo(articulo);
        }
    }
}
