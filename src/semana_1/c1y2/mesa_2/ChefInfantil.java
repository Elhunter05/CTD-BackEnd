package semana_1.c1y2.mesa_2;

public class ChefInfantil extends Chef{


    @Override
    protected Double calcularPrecio(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        return menuInfantil.getPrecioBase()+(menuInfantil.getCantidadJuguetes()*3);
    }
}
