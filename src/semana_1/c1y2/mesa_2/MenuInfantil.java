package semana_1.c1y2.mesa_2;

public class MenuInfantil extends Menu{

    private Integer cantidadJuguetes;

    public MenuInfantil(Double precioBase, Integer cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public Integer getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(Integer cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }
}
