package exercicios_o_2.exercicio06;

public class ContasTeste {
	public static void main(String[] args) {
		/*
		 * ContaCorrente contaCorrente = new ContaCorrente("Gabriel", 1500);
		 * 
		 * contaCorrente.depositar(500); contaCorrente.sacar(200);
		 * System.out.println(contaCorrente.toString());
		 */
		
		ContaEspecial contaEspecial = new ContaEspecial("Laura", 0, 6000);
		
		contaEspecial.depositar(4000);
		contaEspecial.sacar(2500);
		System.out.println(contaEspecial.toString());
		
		

	}

}
