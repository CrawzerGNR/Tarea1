package com.mycompany.asesorias;

import java.util.Scanner; //Paquete para habilitar la entrada de datos por el usuario. 
import java.util.regex.*; // Paquete que contine la clase Matcher y Pattern.

public class Palindroma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Obtener entrada por parte del usuario.
        String nueva = ""; //Declaramos la variable nueva.
        boolean correcto = true; //Variable bandera.

        do { 
            System.out.println("Ingrese una palabra: "); //Requerimos la cadena al usuario.
            String original = original = sc.nextLine(); //Leemos lo escrito por el usuario.
            Pattern patron = Pattern.compile("[A-Za-z]");  //Representa la expresion regular; en este caso la palabra original debe de tener solo letras. 
            Matcher encaja = patron.matcher(original); //Representa en este caso la cadena que vamos a validar.
            /*El Mather (encaja) nos devolvera un Booleano
              en este caso si la palabra contiene letras retornara un true, 
              de lo contario retornara un false.
            */
            if (!encaja.find()) { //Validamos que si es diferente a un true, es porque tiene numeros y debe repetir el ingreso de la cadena.
                correcto = true; //True para que en el While repita el bucle 
                System.out.print("La palabra tiene numeros; "); //Le indicamos al usuario el error
                System.out.println("Intenta de nuevo"); //y lo que debe hacer.
            } else { //Si retorna un true es que la palabra solo contiene letras
                correcto = false; //False para que rompa el ciclo.
                original = original.toLowerCase(); //Pasamos la cadena a solo minusculas.
                for (int i = original.length() - 1; i >= 0; i--) { //Creamos el ciclo For
                    nueva = nueva + original.charAt(i); //Rellenamos la palabra nueva
                }
                if (original.equals(nueva)) { //Validamos que sea palindroma
                    System.out.println("La palabra es palíndroma"); //Si es verdadero
                } else { //Si no es igual a la original
                    System.out.println("La palabra NO es palíndroma"); //No es palindroma
                }
            }

        } while (correcto == true); //Validamos en el bucle While

    }

}
