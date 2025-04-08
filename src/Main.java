import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona0 = new Estudiante("Ramon", 23, "1ºDAM");
        Persona persona1 = new Estudiante("Alvaro", 18, "2ºDAM");
        Persona persona2 = new Profesor("Jose", 43, "Programación");
        Persona persona3 = new Profesor("Manuel", 53, "Base de Datos");
        Persona.personas.add(persona0);
        Persona.personas.add(persona1);
        Persona.personas.add(persona2);
        Persona.personas.add(persona3);
        for (Persona persona : Persona.personas) {
            if (persona instanceof Estudiante estudiante) {
                estudiante.saludar();
                estudiante.mostrarCurso();
            } else if (persona instanceof Profesor profesor) {
                profesor.saludar();
                profesor.mostrarMateria();
                profesor.reganar(profesor, persona1);
            }
        }
    }
}