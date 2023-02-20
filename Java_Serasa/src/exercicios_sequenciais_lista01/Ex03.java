package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Nome funcionário: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu sálario: "));
    
        JOptionPane.showMessageDialog(null,"O funcionério " + nome + " tem um sálario de R$ " + salario + " em Junho" );   
    }
}