package semana_1.c3.mesa_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasanteTest {
    @Test
    public void mostrarCategoriaPasanteNovato(){
        //DADO
        Vendedor pasante = new Pasante("Pedro");
        pasante.vender(1);
        String respEsperada = "Pedro tiene un total de 5 puntos, categoriza como Pasante novato.";
        //CUANDO
        String categoriaMostrada = pasante.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
    @Test
    public void mostrarCategoriaPasanteExperimentado(){
        //DADO
        Vendedor pasante = new Pasante("Juan");
        pasante.vender(12);
        String respEsperada = "Juan tiene un total de 60 puntos, categoriza como Pasante experimentado.";
        //CUANDO
        String categoriaMostrada = pasante.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
}