package semana_1.Playground.Patron_Cadena;

public class HandlerDiputado extends Handler {
    @Override
    public String checkDocument(Document document) {
        //soy el señor diputado
        //sólo puedo leer documentos de tipo 1
        if (document.getTipo() <= getTipoDeAcceso()){
        System.out.println("El señor diputado leyó un documento restringido");
        return document.getContenido();
        } else {
            System.out.println("El señor diputado recibió un documento de nivel superior y pasará a enviárselo al señor ministro");
            return this.getNextHandler().checkDocument(document);
        }
    }
}
