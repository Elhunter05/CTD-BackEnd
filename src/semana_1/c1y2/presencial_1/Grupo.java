package semana_1.c1y2.presencial_1;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> personas;

    public Grupo() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona per){
        boolean checkMayoria = per.esMayorDeEdad();
        boolean cantLetras = per.checkNombre4Letras();
        boolean soloLetras = per.checkLetrasAZ();
        boolean checkEdad = per.checkEdad();

        if (checkMayoria&&cantLetras&&soloLetras&&checkEdad){
            personas.add(per);
            System.out.println("Se agregó a la persona: " + per.getNombre());
        }
        else {
            System.err.println("No se puede agregar a la persona: " + per.getNombre());
            if (!checkMayoria){
                System.out.println("La persona debe tener más de 18 años.");
            }
            if (!cantLetras){
                System.out.println("El nombre de la persona tiene que ser de 5 letras o más.");
            }
            if (!soloLetras){
                System.out.println("El nombre de la persona tiene que contener letras de a-z.");
            }
            if (!checkEdad){
                System.out.println("La edad tiene que ser de 0 a 120 años.");
            }
            System.err.println("***************************************************");
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
