package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a Primeira Nota");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a Segunda Nota");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Média das notas:" + media);
    }
}