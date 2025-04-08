public class Profesor extends Persona{
    private String materia;
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public void reganar(Persona persona1, Persona persona2){
        if (persona1 instanceof Profesor){
            System.out.printf("%s: Cállate ya, estúpido de las narices y atiéndeme %s %n", persona1.getNombre(),persona2.getNombre());
        } else if (persona2 instanceof Estudiante){
            System.out.printf("%s: Cállate ya, estúpido de las narices y atiéndeme %s %n", persona2.getNombre(),persona1.getNombre());
        } else {
            System.out.println("Los estudiantes o profesores no se regañan entre ellos.");
        }
    }

    public void mostrarMateria() {
        System.out.printf("Doy clase de: %s %n", materia);
    }
}
