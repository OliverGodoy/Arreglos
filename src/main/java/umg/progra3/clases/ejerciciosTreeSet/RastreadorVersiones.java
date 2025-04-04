package umg.progra3.clases.ejerciciosTreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.TreeMap;

public class RastreadorVersiones {
    private static final Logger logger = LogManager.getLogger(RastreadorVersiones.class);
    // TreeMap para almacenar versiones (ordenadas por número)
    static TreeMap<Integer, String> versiones = new TreeMap<>();
    static int contadorVersion = 0; // Autoincremental

    // Agregar nueva versión
    public static void agregarVersion(String contenido){
        contadorVersion++;
        versiones.put(contadorVersion, contenido);
        logger.info("Agregar versión " + contadorVersion + ": \"" + contenido + "\"");
    }

    // Obtener versión específica
    public static void obtenerVersion(int version) {
        String contenido = versiones.get(version);
        if (contenido != null) {
            logger.info("Versión " + version + ": \"" + contenido + "\"");
        } else {
            logger.error("Versión " + version + " no encontrada.");
        }
    }

    // Obtener última versión
    public void obtenerUltimaVersion() {
        if (!versiones.isEmpty()) {
            int ultimaClave = versiones.lastKey();
            String contenido = versiones.get(ultimaClave);
            logger.info("Última versión: \"" + contenido + "\"");
        } else {
            logger.error("No hay versiones disponibles.");
        }
    }

    // Eliminar una versión
    public void eliminarVersion(int version) {
        if (versiones.containsKey(version)) {
            versiones.remove(version);
            logger.info("Versión " + version + " eliminada.");
        } else {
            logger.error("No se encontró la versión " + version + " para eliminar.");
        }
    }
}
