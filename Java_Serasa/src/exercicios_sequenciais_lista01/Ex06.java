package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor");
        int valor = scan.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("Antecessor " + antecessor + " Sucessor " + sucessor);
        System.out.println("-----------------------------");
        System.out.println("Antecessor " + (valor - 1) + " Sucessor " + (valor + 1));
    }
}