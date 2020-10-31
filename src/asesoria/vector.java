package asesoria;

import javax.swing.JOptionPane;

public class vector {

    public static void main(String[] args) {
        int dimension;
        dimension = Integer.parseInt(JOptionPane.showInputDialog("por favor ingresar la cantidad de edades"));
        int edades[] = new int[dimension];
        llenarvector(dimension,edades);
        Mostrarvector(dimension,edades);
    }

    private static void llenarvector(int dimension,int []edades) {

        JOptionPane.showMessageDialog(null, "A continuacion va a ingresar las edades 1 a 1");
        for (int i = 0; i < dimension; i++) {
           edades[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad "));
        }
    }

    private static void Mostrarvector(int dimension, int[] edades) {
        
        for (int i = 0; i < dimension; i++) {
            System.out.println(String.format(" |%d| ",edades[i]));
        }
    }

}
