import java.util.ArrayList;

public class GestionCursos {
    private ArrayList<Curso> listaCursos;

    public GestionCursos() {
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCursos(Curso curso) {
        listaCursos.add(curso);
    }

    public Curso buscarCursosPorCodigo(String codigo) {
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void listarEstudiantesCursos(String codigo){
        Curso curso = buscarCursosPorCodigo(codigo);
        if (curso != null) {
            curso.listaEstudiantes();
        }else {
            System.out.println("No encontro cursos");
        }
    }

}
