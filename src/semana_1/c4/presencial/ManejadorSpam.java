package semana_1.c4.presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        System.out.println("quedó en spam");
        return "El correo se envió a spam";
    }
}
