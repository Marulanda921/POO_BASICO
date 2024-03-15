import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<Empleado>();
    }


    public void añadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado(int idEmpleado){
        return empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);

    }

    public void mostrarEmpleados(){
        for (Empleado emp : empleados){
            System.out.println("ID Empleado: " + emp.getIdEmpleado() + " Nombre: " + emp.getNombre() + " Salario: " + emp.getSalario());
        }
    }
}
