package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int par = 0;
        int i = 1;
        do {
            
        System.out.println("Digite o " + i + "ª Número.");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            par = par +1;
        }

        i = i+1;

        } while (i <= 20);
        
        System.out.println("Quantidade de números pares = " + par);
    }    
}