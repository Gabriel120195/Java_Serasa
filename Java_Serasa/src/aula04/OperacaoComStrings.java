package aula04;

import javax.swing.JOptionPane;

public class OperacaoComStrings {
    public static void main(String[] args) {
        
        //Quantidade de caracteres na frase
        String frase = JOptionPane.showInputDialog(null, "Escreva a frase: ");
        int tamanho = frase.length();

        JOptionPane.showMessageDialog(null,"Frase: " + frase
                                        + "\n Quantidade de caracteres: " + tamanho);

        // Maiscula e minuscula
        JOptionPane.showMessageDialog(null,"Frase: " + frase
                                     + "\n Em Maisculas: " + frase.toUpperCase()
                                     + "\n Em Minusculas: " + frase.toLowerCase());


        //Separa e mostra as letras da palavra
        String palavra = JOptionPane.showInputDialog(null, "Forneça uma palavra com pelo menos 4 letras: ");
        JOptionPane.showMessageDialog(null,"Palavra: " + palavra
                                                     + "\n Caractere 1: " + palavra.charAt(0)
                                                     + "\n Caractere 2: " + palavra.charAt(1)
                                                     + "\n Caractere 3: " + palavra.charAt(2)
                                                     + "\n Caractere 4: " + palavra.charAt(3));
    }
}