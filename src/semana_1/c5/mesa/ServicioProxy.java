package semana_1.c5.mesa;

public class ServicioProxy implements ServicioInterface {
    private ServicioDescarga servicioDescarga;


    public ServicioProxy() {
        servicioDescarga = new ServicioDescarga();
    }

    @Override
    public String descargar(Usuario usuario) {
        if (usuario.getTipoUsuario().equals("premium")) {
            return servicioDescarga.descargar(usuario);
        } else {
            System.err.println("No puede acceder porque no es un usuario Premium");
            return "No puede acceder porque no es un usuario Premium";
        }
    }
}
