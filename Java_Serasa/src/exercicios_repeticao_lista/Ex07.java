package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaIdades = 0;
        int i = 1;
        do {
            
        System.out.println("Digite a Idade da " + i + "ª Pessoa.");
        int idade = scan.nextInt();

        somaIdades = somaIdades + idade;
        i = i+1;

        } while (i <= 20);
        
        float mediaIdades = somaIdades / 20;

        System.out.println("Média das Idades = " + mediaIdades);
    }
}