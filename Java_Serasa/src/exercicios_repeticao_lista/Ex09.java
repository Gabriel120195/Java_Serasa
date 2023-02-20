package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idadeMaisNova = Integer.MAX_VALUE;
        String nomeMaisNovo = "";

        for (int i = 1; i <= 10; i++) {

            System.out.println("Nome: ");
            String nome = scan.nextLine();

            System.out.println("Idade: ");
            int idade = scan.nextInt();

            scan.nextLine();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
            System.out.println("Nome da pessoa mais nova = " + nomeMaisNovo + "Idade = " + idadeMaisNova);
    }
}