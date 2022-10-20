package semana_1.c3.mesa_3;

public class Pasante extends Vendedor {
    public Pasante(String nombre) {
        super(nombre);
    }

    @Override
    public void calcularPuntos() {
        Integer puntosVentas = getVentas()*5;
        setPuntos(puntosVentas);
    }

    @Override
    public void recategorizar() {
        if (getPuntos() < 50){
            setCategoria("Pasante novato");
        } else {
            setCategoria("Pasante experimentado");
        }
    }
}
