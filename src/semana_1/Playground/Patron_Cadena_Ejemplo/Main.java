package semana_1.Playground.Patron_Cadena_Ejemplo;

public class Main {

    public static void main(String[] args) {

        EmpleadoBanco manejadorBase = new EjecutivoCuenta().setSigEmpleadoBanco(new Gerente().setSigEmpleadoBanco(new Director()));

        manejadorBase.procesarSolicitud(78000);

    }
}
