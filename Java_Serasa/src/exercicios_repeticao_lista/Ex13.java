package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entreZeroECem = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite o " + i + "ª número: ");
            int num = scan.nextInt();

            if ((num > 0) && (num <= 100)) {
                entreZeroECem = entreZeroECem+1;
            }
        }
        System.out.println("Quantidade de números entre 0 e 100 = " + entreZeroECem);    
    }   
}