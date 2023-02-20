package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        
        float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário Atual: R$ "));

        float aumento = salario * 15/100;
    
        JOptionPane.showMessageDialog(null,"Sálario com Aumento R$ " + (aumento+salario));   
    }
}