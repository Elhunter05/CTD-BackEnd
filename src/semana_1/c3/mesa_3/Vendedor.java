package semana_1.c3.mesa_3;

public abstract class Vendedor {
    private String nombre;
    private Integer puntos;
    private Integer ventas;
    private String categoria;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        ventas = 0;
        puntos = 0;
        categoria = "";
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVentas() {
        return ventas;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void vender(int cantVentas){
        ventas += cantVentas;
    };

    public abstract void calcularPuntos();

    public void recategorizar(){
        if (getPuntos() < 20){
            setCategoria("Novato");
        } else if (getPuntos() >= 20 && getPuntos() <= 30){
            setCategoria("Aprendiz");
        } else if (getPuntos() > 30 && getPuntos() <= 40){
            setCategoria("Bueno");
        } else {
            setCategoria("Maestro");
        }
    };

    public String mostrarCategoria() {
        calcularPuntos();
        recategorizar();
        System.out.println(getNombre() + " tiene un total de " + getPuntos() + " puntos, categoriza como " + getCategoria() + ".");
        return getNombre() + " tiene un total de " + getPuntos() + " puntos, categoriza como " + getCategoria() + ".";
    }
}
