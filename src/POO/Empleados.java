package POO;

public abstract class Empleados {

    protected String nombre;
    protected double salario;
    protected int edad;
    protected final double PLUS = 300;

    public Empleados() {
    }

    public Empleados(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;        
    }

    public abstract boolean PLUS();

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
