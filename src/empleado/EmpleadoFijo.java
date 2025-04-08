package empleado;

public class EmpleadoFijo extends Empleado implements Pagable{

    private double complementoAntiguedad;

    protected EmpleadoFijo(String nombre, double salarioBase, double complementoAntiguedad) {
        super(nombre, salarioBase);
        this.complementoAntiguedad = complementoAntiguedad;
    }

    @Override
    double calcularSalario() {
        return getSalarioBase() + complementoAntiguedad;
    }

    @Override
    public String toString() {
        return "EmpleadoFijo{" +
                "complementoAntiguedad=" + complementoAntiguedad +
                '}';
    }

    @Override
    public double calcularPago() {
        return getSalarioBase() + complementoAntiguedad;
    }
}
