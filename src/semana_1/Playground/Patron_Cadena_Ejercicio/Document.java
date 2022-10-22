package semana_1.Playground.Patron_Cadena_Ejercicio;

public class Document {
    private String contenido;
    private Integer tipo;

    public Document(String contenido, Integer tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
