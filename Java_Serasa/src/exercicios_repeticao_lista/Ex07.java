package exercicios_repeticao_lista;

import javax.swing.JOptionPane;

public class Ex07 {
    public static void main(String[] args) {

        int somaIdades = 0;
        int i = 1;

        try {
            do {

                int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Idade da " + i + "ª Pessoa."));
        
                somaIdades = somaIdades + idade;
                i = i+1;
        
                } while (i <= 20);
        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Você digitou um valor Inválido!  Digite números por favor!");
        }

        float mediaIdades = somaIdades / 20;
   
        System.out.println("Média das Idades = " + mediaIdades);
    }
}