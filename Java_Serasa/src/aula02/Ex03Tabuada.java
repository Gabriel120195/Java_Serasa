package aula02;

import javax.swing.JOptionPane;

// Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário 
// fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.

public class Ex03Tabuada {
    public static void main(String[] args) {
        int tabuada = 0;
        int i = 0;
        
        int valProduto = Integer.parseInt (JOptionPane.showInputDialog(null,"Tabuada do numero: "));

        for ( i = 1; i <= 10; i++) {
            
            tabuada = i * valProduto;

            //JOptionPane.showMessageDialog(null,i + " x " + valProduto + " = " + tabuada);
            System.out.println(i + " x " + valProduto + " = " + tabuada);
        }
    }
}