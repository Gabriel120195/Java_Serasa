package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
    
    double produto = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Produto: R$ "));

    double desconto = produto * 5/100;

    JOptionPane.showMessageDialog(null,"PREÇO PROMOCIONAL R$ " + (produto - desconto));   
    }
}