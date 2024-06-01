abstract class Empleado {

    private String nombre;
    private String numeroidentificacion;

    public Empleado(String nombre, String numeroidentificacion) {
        this.nombre = nombre;
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    //metodo abstracto
    public abstract double calcularSalario();
}
