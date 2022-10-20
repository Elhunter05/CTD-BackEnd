package semana_1.c1y2.mesa_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefVegetarianoTest {


    @Test
    public void testVegetariano(){
        ChefVegetariano chefV1 = new ChefVegetariano();
        MenuVegetariano menuC1 = new MenuVegetariano(54., 2,true);

        String respuestaEsperada = "Se esta preparando tu orden, el precio es: 58.58";

        Assertions.assertEquals(chefV1.preparar(menuC1), respuestaEsperada);

    }

}