package exercicios_repeticao_lista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args) {
        
        int idadeMaisNova = 0;
        String nomeMaisNovo = "";

        for (int i = 1; i <= 10; i++) {

            String nome = JOptionPane.showInputDialog(null,"Nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade: "));

            if (idadeMaisNova == 0 || idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
            System.out.println("Nome da pessoa mais nova = " + nomeMaisNovo + "\nIdade = " + idadeMaisNova);
    }
}