package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        final int ANO_ATUAL = 2023;

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de Nascimento: "));

        int calculaAno = ANO_ATUAL - anoNascimento;

        if ((calculaAno < 70) && (calculaAno < 16)) {
            JOptionPane.showMessageDialog(null,"Você tem " + calculaAno + " anos e infelizmente NÃO PODE Votar!!" );
        } else {
            JOptionPane.showMessageDialog(null,"Você tem " + calculaAno + " anos e PODE Votar!!");
        }
    }
}