package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor");
        float valor = scan.nextFloat();

        float dobro = valor * 2;
        float tercaParte = valor / 3;

        System.out.println("O dobro de " + valor + " é " + dobro + "\n"
        + "A terça parte de " + valor + " é " + tercaParte);
    }
}