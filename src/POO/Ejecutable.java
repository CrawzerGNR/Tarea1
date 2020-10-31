package POO;

import javax.swing.JOptionPane;

public class Ejecutable {

    public static void main(String[] args) {
        Comercial co = new Comercial(250, "Pepe", 1000000, 40);
        Repartidor re = new Repartidor("zona 3", "Arnulfo", 2000000, 20);
        
        co.PLUS();
        re.PLUS();
        
        JOptionPane.showMessageDialog(null , co);
        JOptionPane.showMessageDialog(null , re);
    }

}
//