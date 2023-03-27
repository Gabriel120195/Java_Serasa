package exercicios_o_2.exercicio04;

import java.io.ObjectInputStream.GetField;

public class PaisApp {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais("4851-24", "Italia", 1222444.55);
		pais1.setPopulacao(59000000);
		pais1.getPaisesFronteiricos().add("França");
		pais1.getPaisesFronteiricos().add("Áustria");
		pais1.getPaisesFronteiricos().add("Suiça");
		pais1.getPaisesFronteiricos().add("Eslovênia");

		
		Pais pais2 = new Pais("7832-41", "França", 12366647.12);
		pais2.setPopulacao(68000000);
		pais2.getPaisesFronteiricos().add("Espanha");
		pais2.getPaisesFronteiricos().add("Alemanha");
		pais2.getPaisesFronteiricos().add("Italia");
		pais2.getPaisesFronteiricos().add("Bélgica");
		pais2.getPaisesFronteiricos().add("Inglaterra");
		pais2.getPaisesFronteiricos().add("Suiça");
		pais2.getPaisesFronteiricos().add("Brasil");

		
		System.out.println("Densidade populacional " + pais1.getNome() + " = " + pais1.getDensidadePopulacional());
		System.out.println("Densidade populacional " + pais2.getNome() + " = " + pais2.getDensidadePopulacional());
		
		System.out.println("É limitrofe? " + pais1.isLimitrofe("Suiça"));
		System.out.println("É limitrofe? " + pais2.isLimitrofe("Brasil"));
	}
}
