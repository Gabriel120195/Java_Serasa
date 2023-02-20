package exercicios_sequenciais_lista01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma distância: ");
        float medida  = scan.nextFloat();

        System.out.println("A distância de " + medida + "m corresponde a:");

        float km = medida / 1000;
        float hm = medida / 100;
        float dam = medida / 10;
        float dm = medida * 1;
        float cm = medida * 100;
        float mm = medida * 1000;

        System.out.println(km + " Quilômetros(Km)");
        System.out.println(hm + " Hectômetro(Hm)");
        System.out.println(dam + " Decâmetro(Dm)");
        System.out.println(dm + " Decímetro(Dc)");
        System.out.println(cm + " Centímetro(Cm)");
        System.out.println(mm + " Milímetro(Mm)");
    }
}