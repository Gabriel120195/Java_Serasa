package aula01;

import java.util.Scanner;

// 1 - Crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e 
// mostre o valor do desconto e o valor do produto com o desconto. Observação: o valor do 
// desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de 
// desconto / 100.

public class Ex01DescontoProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do produto: R$ ");
        int valProduto = scan.nextInt();

        System.out.println("Desconto de: % ");
        int valDesconto = scan.nextInt();

        double desCalculo = (valProduto * valDesconto) / 100;

        System.out.println("Valor do produto com desconto: R$ " + (valProduto - desCalculo));
    }
}