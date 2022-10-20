package semana_1.Playground.Patron_Cadena;

public abstract class Handler {

    private Integer tipoDeAcceso;
    private Handler nextHandler;

    public Integer getTipoDeAcceso() {
        return tipoDeAcceso;
    }

    public void setTipoDeAcceso(Integer tipoDeAcceso) {
        this.tipoDeAcceso = tipoDeAcceso;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler sigMiembro) {
        this.nextHandler = sigMiembro;
    }

    public abstract String checkDocument(Document document);
}
