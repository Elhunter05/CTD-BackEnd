package semana_1.c1y2.mesa_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefClasicoTest {

    @Test
    public void testClasico(){
        ChefClasico chefC1 = new ChefClasico();
        MenuClasico menuC1 = new MenuClasico(54.0);

        String respuestaEsperada = "Se esta preparando tu orden, el precio es: 54.0";

        Assertions.assertEquals(chefC1.preparar(menuC1), respuestaEsperada);

    }

}