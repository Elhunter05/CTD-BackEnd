package semana_1.Playground.Patron_Cadena_Ejercicio;

public class DocumentChecker {
    private Handler chain;

    public DocumentChecker() {
        //punto inicial
        chain = new HandlerDiputado();
        chain.setTipoDeAcceso(1);
        //creo objetos de cada eslabón y les doy sus correspondientes accesos
        Handler ministro = new HandlerMinistro();
        ministro.setTipoDeAcceso(2);
        Handler presidente = new HandlerPresidente();
        presidente.setTipoDeAcceso(3);
        //unimos los eslabones
        chain.setNextHandler(ministro);
        ministro.setNextHandler(presidente);
    }

    public String check(Document document){ return chain.checkDocument(document);}
}
