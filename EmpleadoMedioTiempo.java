public class EmpleadoMedioTiempo extends Empleado {

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre, String numeroidentificacion, double salarioPorHora, int horasTrabajadasPorSemana) {
        super(nombre, numeroidentificacion);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }
    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadasPorSemana * 4; //Salario mensual
    }
}
