package Practica2;

import java.util.ArrayList;
import java.util.List;

public class Mercancia {

    private String nombre;
    private int existencia;
    private String fechaEntrada;
    private int puntoReorden;
    private List<Pedido> pedidos;

    public Mercancia(String nombre, int existencia, String fechaEntrada, int puntoReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaEntrada = fechaEntrada;
        this.puntoReorden = puntoReorden;
        this.pedidos = new ArrayList<>();
    }

    public void restarExistencia (int cantidadRe){
        if (existencia >= cantidadRe){
            existencia-=cantidadRe;
            if (existencia <= puntoReorden)
                System.out.println("Necesitas hacer un pedido");
        } else {
            System.out.println("No hay suficiente mercancia,haz un pedido");
        }
    }

    public void agregarExistencia (int cantidadR){
        existencia+=cantidadR;
    }

    public void agregarPedido (Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void eliminarPedido (Pedido pedido){
        this.pedidos.remove(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public int getPuntoReorden() {
        return puntoReorden;
    }

    @Override
    public String toString() {
        return "Mercancia{" +
                "Nombre='" + nombre + '\'' +
                ", Existencia=" + existencia +
                ", Fecha de Entrada='" + fechaEntrada + '\'' +
                ", Punto de Reorden=" + puntoReorden +
                '}';
    }
}
