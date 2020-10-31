package POO;

import javax.swing.JOptionPane;

public class Comercial extends Empleados {

    private double comision;

    public Comercial(double comision, String nombre, double salario, int edad) {        
        super(nombre, salario, edad);
        this.comision = comision;        
    }

    @Override
    public boolean PLUS() {
        if (super.getEdad() > 30 && this.comision > 200) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            JOptionPane.showMessageDialog(null, String.format("Se añadio el plus, al empleado %s de %.0f$", super.getNombre(), super.PLUS));
            return true;
        }
        return false;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

}
