package semana_1.Playground.Patron_Cadena_Ejemplo;

public abstract class EmpleadoBanco {

    protected EmpleadoBanco sigEmpleadoBanco;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) {
        this.sigEmpleadoBanco = sigEmpleadoBanco;
        return this;
    }
}
