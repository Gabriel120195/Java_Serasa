package exercicios_repeticao_lista;

public class Ex02 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {    
            soma = soma + i;
        }
        System.out.println("Soma dos valores de 1 a 15 = " + soma);
    }
}