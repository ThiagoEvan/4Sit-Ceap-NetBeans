package Model;

import javax.swing.JOptionPane;

public class ClasseX_DAO {
    
    static double valor1 = 0;
    static double valor2 = 0;
    static double resul = 0;
    
    public static void Soma(){
       valor1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1° número"));
       valor2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2° número"));
        
       resul = valor1 + valor2 ;
        JOptionPane.showMessageDialog(null, valor1+" + "+valor2+" = "+ resul);
    }
    
    public static void Subtracao(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1° número"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2° número"));
        
        resul = valor1 - valor2 ;
        JOptionPane.showMessageDialog(null, valor1+" - "+valor2+" = "+ resul);
    }
    
    public static void Divisao(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1° número"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2° número"));
        
        resul = valor1 / valor2 ;
        JOptionPane.showMessageDialog(null, valor1+" / "+valor2+" = "+ resul);
    
    }
    
    public static void Multi(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1° número"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2° número"));
        
        resul = valor1 * valor2 ;
        JOptionPane.showMessageDialog(null, valor1+" x "+valor2+" = "+ resul);
    }
}
