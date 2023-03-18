package exercicios_o.o_ex_1_3;

import java.text.DecimalFormat;

public class EmpregadoTeste {

	public static void main(String[] args) {
	        DecimalFormat df = new DecimalFormat();
	        df.applyPattern("R$ #,##0.00");

	        Empregado empregado1 = new Empregado("Gabriel","Silva", 2500.00f);
	        System.out.println("Nome = " + empregado1.getPrimeiroNome() + " " + empregado1.getSegundoNome() + " / Salário " + df.format(empregado1.getSalario()) + " / Salário Anual " + df.format(empregado1.getSalarioAnual()));
	    
	        Empregado empregado2 = new Empregado("Laura","Oliveira", 4500.00f);
	        System.out.println("Nome = " + empregado2.getPrimeiroNome() + " " + empregado2.getSegundoNome() + " / Salário " + df.format(empregado2.getSalario()) + " / Salário Anual " + df.format(empregado2.getSalarioAnual()));
	        
	        System.out.println("");
	        System.out.println("============== Atualização ==================");
	        System.out.println(" ");

	        empregado1.setAumentoSalario();
	        System.out.println("Nome = " + empregado1.getPrimeiroNome() + " " + empregado1.getSegundoNome());
	        System.out.println("Salário com Aumento: " + df.format(empregado1.getSalario()));
	        System.out.println("Salário Anual com Aumento: " + df.format(empregado1.getSalarioAnual()));

	        System.out.println();
	        System.out.println("================================");
	        System.out.println();
	        
	        empregado2.setAumentoSalario();
	        System.out.println("Nome = " + empregado2.getPrimeiroNome() + " " + empregado2.getSegundoNome());
	        System.out.println("Salário com Aumento: " + df.format(empregado2.getSalario()));
	        System.out.println("Salário Anual com Aumento: " + df.format(empregado2.getSalarioAnual()));
	}
}
