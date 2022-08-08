package Model;

import javax.swing.JOptionPane;

public class Tela_DAO {
    
    static int valor = 0;
    
    public static void SolicitaOperacao(){
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione Operação\n1.Soma '+'\n2.Subtração '-' \n3.Divisão '/'\n4.Multiplicação 'x'"));
        
            switch (valor){
            
            case 1: Model.ClasseX_DAO.Soma();break;
            case 2: Model.ClasseX_DAO.Subtracao();break;
            case 3: Model.ClasseX_DAO.Divisao();break;
            case 4: Model.ClasseX_DAO.Multi();break;
            default: JOptionPane.showMessageDialog(null,"Opcão Inválida!!");break;
        }
    }
}
