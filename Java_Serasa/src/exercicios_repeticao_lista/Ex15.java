package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float i = 1;

        while (i > 0) {

            System.out.println("Digite o número: ");
            i = scan.nextFloat();
        }
        System.out.println("Você digitou um valor menor que Zero!");
    }    
}