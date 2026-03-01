package Practica2;

import java.util.ArrayList;
import java.util.List;

public class Provedoor {
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Pedido> pedidos;

    public Provedoor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido (Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void cancelarPedido (Pedido pedido){
        this.pedidos.remove(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Provedoor{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
