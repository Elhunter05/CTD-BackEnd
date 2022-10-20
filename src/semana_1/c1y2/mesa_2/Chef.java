package semana_1.c1y2.mesa_2;

public abstract class Chef {

    public Chef() {
    }

    public String preparar(Menu menu){
        return "Se esta preparando tu orden, el precio es: "+ calcularPrecio(menu);
    }

    protected abstract Double calcularPrecio(Menu menu);
}
