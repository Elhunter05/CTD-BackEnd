package semana_1.c4.mesa;

public class AnalistaPeso extends AnalistaDeCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
        if(articulo.getPeso() < 1200 || articulo.getPeso() > 1300){
            System.out.println("El articulo fue rechazado. Peso fuera de rango.");
            return "El articulo fue rechazado. Peso fuera de rango.";
        } else {
            return this.getSiguienteAnalista().comprobarArticulo(articulo);
        }
    }
}
