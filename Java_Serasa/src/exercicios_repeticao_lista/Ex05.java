package exercicios_repeticao_lista;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaValores = 0;
        int i = 1;
        do {
            
        System.out.println("Digite o " + i + "ª número");
        int valor = scan.nextInt();

        somaValores = somaValores + valor;
        i = i+1;

        } while (i <= 15);

        System.out.println("Soma dos valores = " + somaValores);
    }
}