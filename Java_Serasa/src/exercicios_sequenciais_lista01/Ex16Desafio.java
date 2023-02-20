package exercicios_sequenciais_lista01;

import javax.swing.JOptionPane;

public class Ex16Desafio {
    public static void main(String[] args) {
        final int DIAS_ANO = 365;

        int cigarros = Integer.parseInt (JOptionPane.showInputDialog(null, "Quantidade de cigarros por dia: "));
        int anosDeFumante = Integer.parseInt (JOptionPane.showInputDialog(null, "Quantidade de anos que a pessoa fuma: "));

        float reducaoMinutos = (anosDeFumante * DIAS_ANO) * cigarros * 10;
        float reducaoDias = reducaoMinutos / (24*60);

        JOptionPane.showMessageDialog(null,"Dias perdidos: " + reducaoDias );  
    }
}