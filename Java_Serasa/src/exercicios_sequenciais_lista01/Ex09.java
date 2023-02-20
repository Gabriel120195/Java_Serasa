package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor na carteira R$ ");
        float valor = scan.nextFloat();

        float conv = valor * 3.45f;

        System.out.println("US$ " + conv);
    }    
}