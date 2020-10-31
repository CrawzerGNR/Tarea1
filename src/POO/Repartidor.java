package POO;

import javax.swing.JOptionPane;

public class Repartidor extends Empleados {

    private String zona;

    public Repartidor() {
    }

    public Repartidor(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, double salario, int edad) {
        super(nombre, salario, edad);
        this.zona = zona;
    }

    @Override
    public boolean PLUS() {
        if (super.getEdad() < 25 && this.zona.equals("zona 3")) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            JOptionPane.showMessageDialog(null, String.format("Se aplico un plus al trabajador %s de %.0f$", super.getNombre(), super.PLUS));
            return true;
        }
        return false;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
