package semana_1.Playground.Patron_Cadena;

public class HandlerPresidente extends Handler {

    @Override
    public String checkDocument(Document document) {
        //soy el presidente
        //puedo leer todo tipo de documentos
        System.out.println("El presidente leyó un documento muy secreto");
        return document.getContenido();
    }
}
