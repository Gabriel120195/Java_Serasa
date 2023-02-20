package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        int ano = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o Ano: "));

        if (ano % 400 == 0) {
        }
            if ((ano % 4 == 0 ) && (ano % 100 != 0)){
                JOptionPane.showMessageDialog(null,ano + " = Bissexto!" );
            }

        else {
            JOptionPane.showMessageDialog(null,ano + " = Não é bissextos!");
        }
    }    
}
