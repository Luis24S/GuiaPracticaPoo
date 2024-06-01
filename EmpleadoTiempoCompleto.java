public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroidentificacion, double salarioAnual) {
        super(nombre, numeroidentificacion);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario() {
        return salarioAnual / 12; //salario mensual
    }
}
