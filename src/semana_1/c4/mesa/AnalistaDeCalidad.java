package semana_1.c4.mesa;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad siguienteAnalista;

    public abstract String comprobarArticulo(Articulo articulo);

    public AnalistaDeCalidad getSiguienteAnalista() {
        return siguienteAnalista;
    }

    public void setSiguienteAnalista(AnalistaDeCalidad siguienteAnalista) {
        this.siguienteAnalista = siguienteAnalista;
    }
}
