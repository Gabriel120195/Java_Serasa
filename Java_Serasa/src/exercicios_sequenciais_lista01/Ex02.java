package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Qual Seu Nome: ");

        JOptionPane.showMessageDialog(null,"Olá " + nome + " é um prazer te conhecer!" );  
    }
}