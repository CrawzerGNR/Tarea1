//Diseñar un algoritmo que organice de manera ascendente 3 números ingresados.
package asesoria;

import java.util.Scanner;


public class Asesoria {

    
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
       int numero1,numero2;
        System.out.println("Ingrese el primer numero entero");
        numero1=Leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        numero2=Leer.nextInt();
        //do {
//            System.out.println("Porfavor ingrese un dato ");
//            while (!Leer.hasNextInt()){
//                System.out.println("esto no es un dato correcto");
//                System.out.println("porfavor ingrese un dato ");
//                Leer.nextInt();
//            }
//            dato=Leer.nextInt();
//            if (dato<=0){
//                System.out.println("por favor ingresar un dato mayor a 0");
//             }
//        } while (dato<=0);
        
        if(numero1<numero2 )
        {
            
            System.out.println("el orden ascendete es: "+numero1+" "+numero2);
            
        } else{
              
                System.out.println("el orden ascendete es: "+numero2+" "+numero1);
            
              }

        
    }
    
}
