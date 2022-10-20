package semana_1.c3.mesa_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    @Test
    public void mostrarCategoriaEmpleadoNovato(){
        //DADO
        Vendedor empleado = new Empleado("Pedro", 1);
        empleado.vender(1);
        String respEsperada = "Pedro tiene un total de 10 puntos, categoriza como Novato.";
        //CUANDO
        String categoriaMostrada = empleado.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
    @Test
    public void mostrarCategoriaEmpleadoMaestro(){
        //DADO
        Empleado empleado = new Empleado("Juan", 2);
        empleado.vender(5);
        empleado.conseguirAfiliado(new Afiliado("Pepe"));
        String respEsperada = "Juan tiene un total de 45 puntos, categoriza como Maestro.";
        //CUANDO
        String categoriaMostrada = empleado.mostrarCategoria();
        //ENTONCES
        assertEquals(respEsperada, categoriaMostrada);
    }
}