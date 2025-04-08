package empleado;

public class EmpleadoPorHoras extends Empleado implements Pagable{
    private int horasTrabajadas;
    private double pagoPorHora;
    protected EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    double calcularSalario() {
        return getSalarioBase() + (horasTrabajadas * pagoPorHora);
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", pagoPorHora=" + pagoPorHora +
                '}';
    }

    @Override
    public double calcularPago() {
        return getSalarioBase() + (horasTrabajadas * pagoPorHora);
    }
}
