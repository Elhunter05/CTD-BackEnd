package semana_1.Playground.Patron_Template_Ejemplo;

public class CocineroVeggie extends Cocinero {


    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate y diferentes quesos");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando quesos y tomate");

    }
}
