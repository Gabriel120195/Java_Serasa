package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorQueOito = 0;
        int i = 1;
        do {
            
        System.out.println("Digite o " + i + "ª Número.");
        int idade = scan.nextInt();

        if (idade > 8) {
            maiorQueOito = maiorQueOito +1;
        }

        i = i+1;

        } while (i <= 20);
        
        System.out.println("Quantidade de números maiores que 8 = " + maiorQueOito);
    }
}