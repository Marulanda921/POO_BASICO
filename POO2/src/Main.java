public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion1 = new GestionEmpleados();
        Empleado emp1 = new EmpleadoTemporal("Alejandro", "21", 1, 20000,"22/03/2029");
        Empleado emp2 = new EmpleadoPermanente("Maryhug", "18", 2, 15000, 5);


        gestion1.añadirEmpleado(emp1);
        gestion1.añadirEmpleado(emp2);

        gestion1.mostrarEmpleados();

        gestion1.eliminarEmpleado(1);
        System.out.println("\n");

        gestion1.mostrarEmpleados();


    }
}