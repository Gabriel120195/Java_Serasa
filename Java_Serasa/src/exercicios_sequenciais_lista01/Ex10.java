package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Comprimento da Parede: ");
        float comprimento = scan.nextFloat();
        System.out.println("Altura da Parede: ");
        float altura = scan.nextFloat();

        float area = altura * comprimento;

        System.out.println("Área: " + area + "m²");
        System.out.println("Você necessita de " + (area/2) + "ml de tinta.");
    }
}