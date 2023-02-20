package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual tabuada gostaria de saber: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            int tabuada = i * numero;

            System.out.println(i + " x " + numero + " = " +  tabuada);
        }
    }
}