package semana_1.c3.mesa_3;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Vendedor {
    private Integer antiguedad;
    private List<Afiliado> afiliadoList;

    public Empleado(String nombre, Integer antiguedad) {
        super(nombre);
        this.antiguedad = antiguedad;
        afiliadoList = new ArrayList<>();
    }

    public void conseguirAfiliado(Afiliado afiliado){
        afiliadoList.add(afiliado);
    };

    @Override
    public void calcularPuntos() {
        Integer acumulador = 0;
        for (Afiliado afiliado : afiliadoList) {
            acumulador +=10;
        }
        acumulador += getVentas()*5;
        acumulador += antiguedad*5;
        setPuntos(acumulador);
    }
}
