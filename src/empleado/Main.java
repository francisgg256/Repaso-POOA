package empleado;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Empleado> empleados = new HashMap<>();
        Empleado empleado0 = new EmpleadoFijo("Paco", 900, 100);
        Empleado empleado1 = new EmpleadoPorHoras("Joaquín", 1200, 40, 12);
        empleados.put(1,empleado0);
        empleados.put(2, empleado1);

        for (Empleado empleado : empleados.values()) {
            if (empleado instanceof EmpleadoFijo empleadoFijo) {
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getSalarioBase());
                System.out.println(empleadoFijo.calcularPago());
            } else if (empleado instanceof EmpleadoPorHoras empleadoPorHoras) {
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getSalarioBase());
                System.out.println(empleadoPorHoras.calcularPago());
            }
        }
    }
}
