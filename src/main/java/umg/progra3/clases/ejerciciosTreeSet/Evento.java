package umg.progra3.clases.ejerciciosTreeSet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Evento implements Comparable<Evento> {
    private LocalDateTime fecha;
    private String nombre;
    private String ubicacion;

    public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int compareTo(Evento otro) {
        return this.fecha.compareTo(otro.fecha);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return Objects.equals(fecha, evento.fecha) &&
                Objects.equals(nombre, evento.nombre) &&
                Objects.equals(ubicacion, evento.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, nombre, ubicacion);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "\"" + nombre + "\", " + fecha.format(formatter) + ", " + ubicacion;
    }
}
