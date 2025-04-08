public class Estudiante extends Persona{
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void mostrarCurso(){
        System.out.printf("Estoy matriculado en: %s %n", curso);
    }
}
