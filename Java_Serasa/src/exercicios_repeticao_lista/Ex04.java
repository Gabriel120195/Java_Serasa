package exercicios_repeticao_lista;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome: ");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes gostaria de digitar o nome na tela: "));
    
        for (int i = 1; i <= n; i++) {
            
            System.out.println(i + " = " + nome);
        }
    }
}