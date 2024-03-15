public class Main {
    public static void main(String[] args) {
        GestionCursos gestion1 = new GestionCursos();

        Curso curso1 = new Curso("XLR2", "Ingenieria Informatica");
        Curso curso2 = new Curso("XLR3", "Ingenieria Mecatronica");

        Estudiante estudiante1 = new Estudiante(1, "Alejandro Marulanda", "Alejandromarulanda702@gmail.com");
        Estudiante estudiante2 = new Estudiante(2, "Maryhug Duran", "Maryhudd@gmail.com");


        curso1.inscribirEstudiante(estudiante1);
        curso2.inscribirEstudiante(estudiante2);

        gestion1.agregarCursos(curso1);
        gestion1.agregarCursos(curso2);

        gestion1.listarEstudiantesCursos("XLR2");
        gestion1.listarEstudiantesCursos("XLR3");
    }
}