public class EmpleadoTemporal extends Empleado {
    private String fechaFinContrato;


    public EmpleadoTemporal(String nombre, String edad, int idEmpleado, double salario, String fechaFinContrato) {
        super(nombre, edad, idEmpleado, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}
