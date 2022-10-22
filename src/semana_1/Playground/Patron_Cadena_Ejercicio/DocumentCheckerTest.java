package semana_1.Playground.Patron_Cadena_Ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DocumentCheckerTest {
    @Test
    public void diputadoLeeDocumentoRestringido(){
        //dado
        Document documentoRestringido = new Document("Contenido reservado", 1);
        DocumentChecker handler = new DocumentChecker();
        String respEsperada = "Contenido reservado";
        //cuando
        String procesamiento = handler.check(documentoRestringido);
        //entonces
        Assertions.assertEquals(respEsperada, procesamiento);
    }
    @Test
    public void ministroLeeDocumentoSecreto(){
        //dado
        Document documentoRestringido = new Document("Contenido secreto", 2);
        DocumentChecker handler = new DocumentChecker();
        String respEsperada = "Contenido secreto";
        //cuando
        String procesamiento = handler.check(documentoRestringido);
        //entonces
        Assertions.assertEquals(respEsperada, procesamiento);
    }
    @Test
    public void presidenteLeeDocumentoMuySecreto(){
        //dado
        Document documentoRestringido = new Document("Contenido muy secreto", 3);
        DocumentChecker handler = new DocumentChecker();
        String respEsperada = "Contenido muy secreto";
        //cuando
        String procesamiento = handler.check(documentoRestringido);
        //entonces
        Assertions.assertEquals(respEsperada, procesamiento);
    }
}