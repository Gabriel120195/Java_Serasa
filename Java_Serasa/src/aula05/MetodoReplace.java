package aula05;

import java.util.Scanner;

public class MetodoReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = "O cachorro faz auau, o gato miau e a galinha coco";

        System.out.println("Digite o valor procurado: ");
        String procurado = scan.next();

        System.out.println("Digite o valor que vai substituir: ");
        String aSubstituir = scan.next();

        String fraseComSubstituicao = frase.replace(procurado, aSubstituir);

        System.out.println("Frase: " + frase);
        System.out.println("Frase com a troca: " + fraseComSubstituicao);
    }    
}