
package agenda05;

import javax.swing.JOptionPane;

public class Agenda05 {

    public static void main(String[] args) {
        //Caixa de dialogo
        String idade = JOptionPane.showInputDialog(null,"Digite a idade: ");
        
        //Processamento
        if (Float.parseFloat(idade)>= 60) {
            if (Float.parseFloat(idade) < 80) {
                JOptionPane.showMessageDialog(null,"Fila prioritária");
            } else {
               JOptionPane.showMessageDialog(null,"Fila prioritária especial");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Fila comum");
        }
    }
    
}
