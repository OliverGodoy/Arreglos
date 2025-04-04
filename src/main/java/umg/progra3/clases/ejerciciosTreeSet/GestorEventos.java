package umg.progra3.clases.ejerciciosTreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;

public class GestorEventos {
    private static final Logger logger = LogManager.getLogger(GestorEventos.class);
    private TreeSet<Evento> eventos = new TreeSet<>();

    // Agregar nuevo evento
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Mostrar lista completa en orden cronológico
    public void mostrarEventos() {
        logger.info("Lista de eventos:");
        int i = 1;
        for (Evento e : eventos) {
            logger.info(i++ + ". " + e);
        }
    }

    // Obtener el próximo evento (el primero que aún no ha pasado)
    public Evento obtenerProximoEvento() {
        LocalDateTime ahora = LocalDateTime.now();
        Iterator<Evento> it = eventos.iterator();
        while (it.hasNext()) {
            Evento e = it.next();
            if (e.getFecha().isAfter(ahora)) {
                logger.info("Próximo evento: " + e);
                return e;
            } else {
                // Evento pasado → lo eliminamos
                it.remove();
            }
        }
        logger.info("No hay eventos próximos.");
        return null;
    }
}
