import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> Productos;

    public Inventario() {
        this.Productos = new ArrayList<Producto>();
    }

    public void agregarProductos(Producto producto) {
        this.Productos.add(producto);
    }

    public boolean eliminarProductos(int id) {
        return Productos.removeIf(producto -> producto.getId() == id);
    }

    public void listarProductos(){
        for (Producto iterador : Productos){
            System.out.println("ID:" + iterador.getId() + " Nombre: " + iterador.getNombre() + " Precio: " + iterador.getPrecio());
        }
    }




}
