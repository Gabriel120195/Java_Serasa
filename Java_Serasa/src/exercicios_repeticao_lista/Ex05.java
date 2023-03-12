package exercicios_repeticao_lista;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {

        int somaValores = 0;
        int i = 1;

        try {

            do {

            int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o " + i + "ª número"));
    
            somaValores = somaValores + valor;
            i = i+1;
    
            } while (i <= 10);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Você digitou um valor Inválido!  Digite números por favor!");
        }

        System.out.println("Soma dos valores = " + somaValores);
    }
}