package semana_1.Playground.Patron_Cadena_Ejercicio;

public class HandlerMinistro extends Handler {

    @Override
    public String checkDocument(Document document) {
        //soy el señor ministro
        //puedo leer documentos de tipo 1 y 2
        if (document.getTipo() <= getTipoDeAcceso()){
            System.out.println("El señor ministro leyó un documento secreto");
            return document.getContenido();
        } else {
            System.out.println("El señor ministro recibió un documento de nivel superior y pasará a enviárselo al presidente");
            return this.getNextHandler().checkDocument(document);
        }
    }
}
