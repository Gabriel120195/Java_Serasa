package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        int valor = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o número: "));

        if (valor % 2 == 0) {
            JOptionPane.showMessageDialog(null,valor + " = PAR" );
        } else {
            JOptionPane.showMessageDialog(null,valor + " = IMPAR");
        }
    }    
}