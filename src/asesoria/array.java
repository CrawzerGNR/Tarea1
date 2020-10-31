
package asesoria;

import java.util.Scanner;


public class array {
    private Scanner Leer= new Scanner(System.in);
    int edades[];
    public int tamaño(){
        
        int dimension;
        System.out.println("por favor ingresar la dimension");
        dimension=Leer.nextInt();
        return dimension;
    }
    public void llener_edades(int dimension){
        edades=new int[dimension];
        for (int i = 0; i < dimension ; i++) {
            System.out.println("ingrese la edad");
            edades[i]=Leer.nextInt();
        }
    }
    
    public static void main(String[] args) {
        int dimensi;
        array obj=new array();
        dimensi=obj.tamaño();
        obj.llener_edades(dimensi);
        obj.Mostrarvector(dimensi);
    }

    private void Mostrarvector(int dimensi) {
        for (int i = 0; i < edades.length; i++) {
            System.out.println("|"+edades[i]+"|");
        }
    }
    
}
