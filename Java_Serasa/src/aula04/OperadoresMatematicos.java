package aula04;

public class OperadoresMatematicos {
    public static void main(String[] args) {
        float valorA = 8.54f;
        float valorB = 5.8f;

        //Arredondado valores para cime e baixo
        System.out.println("==Arredondado valores para cime e baixo==");
        System.out.println(Math.round(valorA));
        System.out.println(Math.round(valorB));
        System.out.println("");

        //Retorna o MAIOR valor entre os numeros
        System.out.println("==Retorna o maior valor entre os numeros==");
        System.out.println(Math.max(valorA, valorB));
        System.out.println("");
        
        //Retorna o MENOR valor entre os numeros
        System.out.println("==Retorna o maior valor entre os numeros==");
        System.out.println(Math.min(valorA, valorB));
        System.out.println("");

        //Retorna a raiz quadrada
        System.out.println("==Retorna a raiz quadrada do valor==");
        System.out.println(Math.sqrt(9));
        System.out.println("");

        //Retorna a potencia
        System.out.println("==Retorna a potencia==");
        int operador = 5;
        int expoente = 2;
        System.out.println(Math.pow(operador, expoente));
        System.out.println("");

        //Retorna o valor absoluto
        System.out.println("==Retorna o valor absoluto==");
        System.out.println(Math.abs(-25));
        System.out.println("");
    }
}