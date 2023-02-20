package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorDeIdade = 0;
        int i = 1;
        do {
            
        System.out.println("Digite a Idade da " + i + "ª Pessoa.");
        int idade = scan.nextInt();

        if (idade >= 18) {
            maiorDeIdade = maiorDeIdade +1;
        }

        i = i+1;

        } while (i <= 20);
        
        System.out.println("Quantidade de maiores de idade = " + maiorDeIdade);
    }
}