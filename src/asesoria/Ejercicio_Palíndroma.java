package asesoria;

import java.util.regex.*;

import javax.swing.JOptionPane;

public class Ejercicio_Palíndroma {
   
//     JOptionPane.showMessageDialog("lo que ingreso no es una consonante\n Por favor intentelo otra vez.")}

    public static void main(String[] args) {

        String palabra;
        int fin;
        boolean correcto = true, bandera = true;
        do {

            palabra = JOptionPane.showInputDialog("por favor ingrese una palabra");
            Pattern patron = Pattern.compile("[A-Za-z]");
            Matcher encaja = patron.matcher(palabra);
            if (!encaja.find()) {
                bandera = true;
                System.out.print("lo que ingreso no es una palabra,");
                System.out.println("por favor intentelo ota vez");
            } else {
                bandera = false;
                palabra = palabra.toLowerCase();
                fin = palabra.length();
                for (int i = 0; i < palabra.length(); i++) {
                    fin = fin - 1;
                    if (palabra.charAt(i) != palabra.charAt(fin)) {
                        correcto = false;
                    }
                }
                if (correcto) {
                    System.out.println(String.format("la palabra  %s es palindroma", palabra));
                } else {
                    System.out.println(String.format("la palabra %s no es palíndroma", palabra));
                }
            }
        } while (bandera == true);
    }

}
