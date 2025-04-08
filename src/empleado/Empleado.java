package empleado;

public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    protected Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    void imprimirDatos() {
        System.out.printf("%s %s %n", nombre, salarioBase);
    }

    @Override
    public String toString() {
        return String.format("nombre: %s, salarioBase: %s %n", nombre,salarioBase);
    }
}
