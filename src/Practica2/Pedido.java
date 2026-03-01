package Practica2;

public class Pedido {

    private int cantidadP; //Cantidad Pedida
    private String fechaPedido; //Fecha del pedido
    private String fechaLlegada; //Fecha de llegada
    private int cantidadR; //Cantidad Recibida
    private Provedoor provedoor; //Proovedor al que se pidio
    private Mercancia mercancia; //Mercancia que se pidio

    public Pedido(int cantidadP, String fechaPedido, Mercancia mercancia, Provedoor provedoor) {
        this.cantidadP = cantidadP;
        this.fechaPedido = fechaPedido;
        this.mercancia = mercancia;
        this.provedoor = provedoor;

        provedoor.agregarPedido(this);
        mercancia.agregarPedido(this);
    }

    public void llegadaPedido (int cantidadR, String fechaLlegada){
        if(cantidadR <= cantidadP){
            this.cantidadR = cantidadR;
            this.fechaLlegada = fechaLlegada;
            mercancia.agregarExistencia(cantidadR);
        } else {
            System.out.println("La cantidad recibida excede la cantidad pedida.");
        }
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public int getCantidadR() {
        return cantidadR;
    }

    public Provedoor getProvedoor() {
        return provedoor;
    }

    public Mercancia getMercancia() {
        return mercancia;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Cantidad Pedida=" + cantidadP +
                ", Fecha del Pedido='" + fechaPedido + '\'' +
                ", Mercancia=" + mercancia.getNombre() +
                ", Proovedor=" + provedoor.getNombre() +
                ", Cantidad Recibida=" + cantidadR +
                ", Fecha de Llegada='" + fechaLlegada + '\'' +
                '}';
    }
}
