package umg.progra3.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.progra3.clases.ejerciciosTreeSet.Evento;
import umg.progra3.clases.ejerciciosTreeSet.GestorEventos;
import umg.progra3.clases.ejerciciosTreeSet.RastreadorVersiones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioTreeSetAndMap {
    private static final Logger logger = LogManager.getLogger(EjercicioTreeSetAndMap.class);

	/* EJERCICIO 1: Análisis de Frecuencia de Palabras (TreeMap)
	 * 📜 Descripción: Escriba un programa que lea un texto de un archivo y cuente la frecuencia de cada palabra, ordenándolas alfabéticamente.
		🔹 Instrucciones:
			Leer un archivo de texto (.txt).
			Dividir el texto en palabras (ignorando puntuaciones y convirtiéndolas a minúsculas).
			Almacenar cada palabra en un TreeMap<String, Integer>, donde la clave es la palabra y el valor es el número de veces que aparece.
			Imprimir las palabras en orden alfabético junto con su frecuencia.
	 */
    public static void AnalisisFrecuenciaPalabras(){
        String nombreArchivo = "texto.txt";

        // TreeMap para almacenar palabras y su frecuencia (ordenadas alfabéticamente)
        TreeMap<String, Integer> frecuenciaPalabras = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Limpiar línea: eliminar puntuaciones y convertir a minúsculas
                linea = linea.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]", "").toLowerCase();

                // Dividir en palabras
                String[] palabras = linea.split("\\s+");

                // Contar frecuencia
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            // Mostrar resultados
            for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
                logger.info(entrada.getKey() + ": " + entrada.getValue());
            }

        } catch (IOException e) {
            logger.error("Error al leer el archivo: " + e.getMessage());
        }
    }



	/* EJERCICIO 2: Rastreador de Versiones de Código (TreeMap)
		📜 Descripción: Desarrolle un programa que simule un rastreador de versiones de archivos en un sistema de control de versiones.
		🔹 Instrucciones:
			Utilice un TreeMap<Integer, String>, donde la clave representa el número de versión y el valor es el contenido de esa versión del código.
			Debe permitir:
			Agregar una nueva versión con una clave autoincrementada.
			Obtener una versión específica dada su clave.
			Obtener la última versión disponible.
			Eliminar una versión específica si es necesario.

			Salida:
				Agregar versión 1: "System.out.println('Hola Mundo');"
				Agregar versión 2: "System.out.println('Hola Java');"
				Última versión: "System.out.println('Hola Java');"
				Versión 1: "System.out.println('Hola Mundo');"
	 *
	 */
    public static void RastreadorVersion(){
        RastreadorVersiones rv = new RastreadorVersiones();

        rv.agregarVersion("('Hola Mundo');");
        rv.agregarVersion("('Hola Java');");

        rv.obtenerUltimaVersion();
        rv.obtenerVersion(1);

        rv.eliminarVersion(1);
        rv.obtenerVersion(1);
    }

    /** EJERCICIO 3: Sistema de Gestión de Eventos (TreeSet)
     📜 Descripción: Implemente un sistema para administrar eventos ordenados cronológicamente.
     🔹 Instrucciones:
     Utilice un TreeSet<Evento>, donde cada Evento debe contener:
     fecha (LocalDateTime)
     nombre (String)
     ubicación (String)
     Los eventos deben ordenarse automáticamente por fecha y hora.
     Debe permitir:
     Agregar un nuevo evento.
     Mostrar la lista de eventos en orden cronológico.
     Obtener el próximo evento a ocurrir.
     Eliminar un evento pasado automáticamente después de una consulta.

     Salida:
     Próximo evento: "Conferencia de Java", 2025-05-10 10:00, Auditorio A
     Lista de eventos:
     1. "Taller de Machine Learning", 2025-04-15 14:00, Sala 3
     2. "Conferencia de Java", 2025-05-10 10:00, Auditorio A
     */
    public static void GestorEvento(){
        GestorEventos gestor = new GestorEventos();

        gestor.agregarEvento(new Evento(LocalDateTime.of(2025, 4, 15, 14, 0), "Taller de Machine Learning", "Sala 3"));
        gestor.agregarEvento(new Evento(LocalDateTime.of(2025, 5, 10, 10, 0), "Conferencia de Java", "Auditorio A"));

        gestor.obtenerProximoEvento();
        gestor.mostrarEventos();
    }
}
