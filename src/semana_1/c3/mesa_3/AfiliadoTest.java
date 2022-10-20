package semana_1.c3.mesa_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoTest {
    @Test
    public void mostrarCategoriaAfiliadoNovato(){
        //DADO
        Vendedor afiliado = new Afiliado("Pedro");
        afiliado.vender(1);
        String respEsperada = "Pedro tiene un total de 15 puntos, categoriza como Novato.";
        //CUANDO
        String categoriaMostrada = afiliado.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
    @Test
    public void mostrarCategoriaAfiliadoMaestro(){
        //DADO
        Vendedor afiliado = new Afiliado("Juan");
        afiliado.vender(5);
        String respEsperada = "Juan tiene un total de 75 puntos, categoriza como Maestro.";
        //CUANDO
        String categoriaMostrada = afiliado.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
}