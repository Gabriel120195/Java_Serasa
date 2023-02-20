package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor de A: ");
        int valA = scan.nextInt();
        System.out.println("Valor de B: ");
        int valB = scan.nextInt();
        System.out.println("Valor de C: ");
        int valC = scan.nextInt();

        float delta = valB * valB -4 * valA * valC;

        System.out.println("Delta: " + delta);
    }
}