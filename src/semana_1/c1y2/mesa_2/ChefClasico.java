package semana_1.c1y2.mesa_2;

public class ChefClasico extends Chef{

    @Override
    protected Double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
