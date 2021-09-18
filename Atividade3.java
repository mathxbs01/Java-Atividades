
package agenda06_exercicio01;

import javax.swing.JOptionPane;

public class Agenda06_Exercicio01 {

    public static void main(String[] args) {
        //variavel
        int mes;
        
        //entrada de dados
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês a ser informado: "));
        
        //processamento
        switch(mes){
            case 1:
                JOptionPane.showMessageDialog(null, "O mês escolhido é janeiro");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "O mês escolhido é fevereiro");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "O mês escolhido é março");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "O mês escolhido é abril");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "O mês escolhido é maio");
            break;
            case 6:
                JOptionPane.showMessageDialog(null, "O mês escolhido é junho");
            break;
            case 7:
                JOptionPane.showMessageDialog(null, "O mês escolhido é julho");
            break;
            case 8:
                JOptionPane.showMessageDialog(null, "O mês escolhido é agosto");
            break;
            case 9:
                JOptionPane.showMessageDialog(null, "O mês escolhido é setembro");
            break;
            case 10:
                JOptionPane.showMessageDialog(null, "O mês escolhido é outubro");
            break;
            case 11:
                JOptionPane.showMessageDialog(null, "O mês escolhido é novembro");
            break;
            case 12:
                JOptionPane.showMessageDialog(null, "O mês escolhido é dezembro");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inválido");
            break;
        }
        
    }
    
}
