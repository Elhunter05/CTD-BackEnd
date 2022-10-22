package semana_1.Playground.Patron_Cadena_Ejemplo;

public class EjecutivoCuenta extends EmpleadoBanco {


    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto < 60000)
            System.out.println("Yo me encargo de gestionarlo. Ejecutivo de cuenta");
        else if (this.sigEmpleadoBanco != null)
            this.sigEmpleadoBanco.procesarSolicitud(monto);

    }
}
