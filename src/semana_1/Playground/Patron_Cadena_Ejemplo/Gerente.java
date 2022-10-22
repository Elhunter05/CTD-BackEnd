package semana_1.Playground.Patron_Cadena_Ejemplo;

public class Gerente extends EmpleadoBanco {
    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto >= 60000 && monto <= 200000)
            System.out.println("Yo me encargo de gestionarlo. Gerente");
        else if (this.sigEmpleadoBanco != null)
            this.sigEmpleadoBanco.procesarSolicitud(monto);


    }
}
