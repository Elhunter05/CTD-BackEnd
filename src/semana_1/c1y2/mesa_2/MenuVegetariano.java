package semana_1.c1y2.mesa_2;

public class MenuVegetariano extends Menu{

    private Integer cantidadSalsas;

    private Boolean tieneEspecias;

    public MenuVegetariano(Double precioBase, Integer cantidadSalsas, Boolean tieneEspecias) {
        super(precioBase);
        this.cantidadSalsas = cantidadSalsas;
        this.tieneEspecias = tieneEspecias;
    }

    public Integer getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(Integer cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }

    public Boolean getTieneEspecias() {
        return tieneEspecias;
    }

    public void setTieneEspecias(Boolean tieneEspecias) {
        this.tieneEspecias = tieneEspecias;
    }
}
