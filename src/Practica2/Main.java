package Practica2;

public class Main {

    public static void main(String[] args) {

        // 1️⃣ Crear mercancía
        Mercancia arroz = new Mercancia("Arroz", 50, "01/03/2026", 20);
        System.out.println("Mercancia creada:");
        System.out.println(arroz);
        System.out.println();

        // 2️⃣ Crear proveedor
        Provedoor proveedor1 = new Provedoor("La Central", "5512345678", "CDMX");
        System.out.println("Proveedor creado:");
        System.out.println(proveedor1);
        System.out.println();

        // 3️⃣ Crear pedido
        Pedido pedido1 = new Pedido(30, "05/03/2026", arroz, proveedor1);
        System.out.println("Pedido realizado:");
        System.out.println(pedido1);
        System.out.println();

        // 4️⃣ Registrar llegada del pedido
        pedido1.llegadaPedido(30, "07/03/2026");
        System.out.println("Pedido recibido:");
        System.out.println(pedido1);
        System.out.println("Estado actual de la mercancía:");
        System.out.println(arroz);
        System.out.println();

        // 5️⃣ Vender mercancía (caso normal)
        System.out.println("Vendiendo 40 unidades...");
        arroz.restarExistencia(40);
        System.out.println(arroz);
        System.out.println();

        // 6️⃣ Vender mercancía y activar punto de reorden
        System.out.println("Vendiendo 25 unidades...");
        arroz.restarExistencia(25);
        System.out.println(arroz);
        System.out.println();

        // 7️⃣ Intentar vender más de lo disponible
        System.out.println("Intentando vender 100 unidades...");
        arroz.restarExistencia(100);
        System.out.println(arroz);
        System.out.println();

        // 8️⃣ Mostrar pedidos del proveedor
        System.out.println("Pedidos del proveedor:");
        for (Pedido p : proveedor1.getPedidos()) {
            System.out.println(p);
        }

        // 9️⃣ Mostrar pedidos de la mercancía
        System.out.println("\nPedidos de la mercancía:");
        for (Pedido p : arroz.getPedidos()) {
            System.out.println(p);
        }
    }
}