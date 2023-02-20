package exercicios_condicionais_simples;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a Primeira Nota");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a Segunda Nota");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;


        if (media >= 7.00) {
            System.out.println("Passou Com bom aproveitamento!");
        }
        else {
            System.out.println("Passou!");
        }
    }    
}