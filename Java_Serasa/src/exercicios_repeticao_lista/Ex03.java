package exercicios_repeticao_lista;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Nome: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-" + nome);
        }
    }    
}