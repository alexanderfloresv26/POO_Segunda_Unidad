package Activida3.Musico;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Composicion {

    private String titulo;
    private Duration duracion;
    private String genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;
    private List<Solicitud> solicitudes;

    public Composicion(String titulo, Duration duracion, String genero, LocalDate fechaRegistro, LocalDate fechaEstreno) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;
        this.solicitudes = new ArrayList<Solicitud>();
    }

    public void addSolicitud(Solicitud solicitud){this.solicitudes.add(solicitud);}

    public void removeSolicitud(Solicitud solicitud){this.solicitudes.remove(solicitud);}

    public List<String> getInterpretes() {
        List<String> nombres = new ArrayList<>();
        for (Solicitud s : solicitudes) {
            nombres.add(s.getNombre());
        }
        return nombres;
    }

    public String getTitulo() {return titulo;}

    public Duration getDuracion() {return duracion;}

    public String getGenero() {return genero;}

    public LocalDate getFechaRegistro() {return fechaRegistro;}

    public LocalDate getFechaEstreno() {return fechaEstreno;}

    public List<Solicitud> getSolicitudes() {return solicitudes;}

    @Override
    public String toString() {
        return "Composicion{" +
                "Titulo='" + titulo + '\'' +
                ", Duracion=" + duracion +
                ", Genero='" + genero + '\'' +
                ", Fecha de Registro=" + fechaRegistro +
                ", Fecha de Estreno=" + fechaEstreno +
                '}';
    }
}
