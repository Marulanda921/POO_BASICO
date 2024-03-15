public class Main {
    public static void main(String[] args) {
       Inventario inv1 = new Inventario();
       Producto prod1 = new Producto(1, "Borrador", 2000);
       ProductoEspecifico prod2 = new ProductoEspecifico(2, "colores", 3400, "Imaginacion", "prismaColores");

       inv1.agregarProductos(prod1);
       inv1.agregarProductos(prod2);

       inv1.listarProductos();

       inv1.eliminarProductos(1);

        System.out.println("\n");
        inv1.listarProductos();

    }
}