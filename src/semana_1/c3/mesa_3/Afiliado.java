package semana_1.c3.mesa_3;

public class Afiliado extends Vendedor {
    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public void calcularPuntos() {
        Integer puntosVentas = getVentas()*15;
        setPuntos(puntosVentas);
    }
}
