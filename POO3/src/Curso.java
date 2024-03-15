import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    //Metodos

    public void inscribirEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public boolean desinscribirEstudiante(int idEstudiante) {
        return listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEstudiante);
    }

    public void listaEstudiantes(){
        for (Estudiante estud : listaEstudiantes){
            System.out.println("ID: " + estud.getId() + " Nombre: " + estud.getNombre());
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
