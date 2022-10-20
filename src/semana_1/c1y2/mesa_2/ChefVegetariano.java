package semana_1.c1y2.mesa_2;

public class ChefVegetariano extends Chef{


    @Override
    protected Double calcularPrecio(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        Double precio = menuVegetariano.getPrecioBase()+(menuVegetariano.getCantidadSalsas()*2);
        if (menuVegetariano.getTieneEspecias()){
            precio = precio*1.01;
        }
        return precio;
    }
}
