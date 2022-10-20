package semana_1.c1y2.mesa_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefInfantilTest {

    @Test
    public void testInfantil(){
        ChefInfantil chefI1 = new ChefInfantil();
        MenuInfantil menuC1 = new MenuInfantil(54., 3);

        String respuestaEsperada = "Se esta preparando tu orden, el precio es: 63.0";

        Assertions.assertEquals(chefI1.preparar(menuC1), respuestaEsperada);

    }

}