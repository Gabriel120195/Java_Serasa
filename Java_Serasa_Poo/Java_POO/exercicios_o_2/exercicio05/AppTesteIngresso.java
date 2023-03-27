package exercicios_o_2.exercicio05;

public class AppTesteIngresso {
	public static void main(String[] args) {
		
		Ingresso ingresso = new Ingresso(125.00f);
		System.out.println(ingresso.toString());
		
		IngressoVip ingressoVip = new IngressoVip(25.00f,ingresso.getValor());
		System.out.println(ingressoVip.toString());
	}
}
