package umg.edu.gt.test.EjercicioTree;


import org.junit.jupiter.api.Test;
import umg.progra3.clases.ejerciciosTreeSet.Evento;
import umg.progra3.clases.ejerciciosTreeSet.RastreadorVersiones;
import umg.progra3.ejercicios.EjercicioTreeSetAndMap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class TestsEjerciciosTest {

    // Ejercicio 1: Analizador de Frecuencia de Palabras
    @Test
    void testAnalisisFrecuenciaPalabras() throws IOException {
        // Capturar la salida del logger
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Ejecutar el método
        EjercicioTreeSetAndMap.AnalisisFrecuenciaPalabras();

        // Restaurar System.out
        System.setOut(originalOut);

        // Obtener la salida capturada
        String output = outputStream.toString();

        // Verificar conteos esperados
        assertTrue(output.contains("hola: 2"));
        assertTrue(output.contains("están: 2"));
        assertTrue(output.contains("mundo: 1"));
        assertTrue(output.contains("prueba: 3"));

    }

    // Ejercicio 2: Rastreador de Versiones
    // Pruebas para obtenerVersion
    @Test
    void testObtenerVersionExistente() {
        assertDoesNotThrow(() -> RastreadorVersiones.obtenerVersion(1));
    }


    // Ejercicio 3: Gestión de Eventos
    private final LocalDateTime fecha1 = LocalDateTime.of(2023, 6, 15, 10, 0);
    private final LocalDateTime fecha2 = LocalDateTime.of(2023, 6, 16, 10, 0);

    @Test
    void testConstructorYGetters() {
        Evento evento = new Evento(fecha1, "Reunión", "Oficina");

        assertEquals(fecha1, evento.getFecha());
        assertEquals("Reunión", evento.getNombre());
        assertEquals("Oficina", evento.getUbicacion());
    }


}
