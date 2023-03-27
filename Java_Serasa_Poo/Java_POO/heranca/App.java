package heranca;

import heranca.funcionarios.Gerente;
import heranca.funcionarios.Diretor;
import heranca.funcionarios.Secretario;
import heranca.funcionarios.Engenheiro;

public class App {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Laura pina", "444222333-1", 10000.00, "laura@gmail.com", 1234, 85);
		Diretor diretor = new Diretor("Nildecio", "222456374-00", 20000.00, "nil@gmail.com", "nil1234", 85);
		Secretario secretario = new Secretario("Gabriel", "423610588-36", 1000.00, "gabriel@hotmail.com", 70, "85 contatos");
		Engenheiro engenheiro = new Engenheiro("Sandra", "777555666-55", 25000.00, "sandra@gmail.com", "444555", "1234587");
		
		
		System.out.println("Salário Gerente    R$ " + gerente.getSalario());
		System.out.println("Salário Diretor    R$ " + diretor.getSalario());
		System.out.println("Salário Secretario R$ " + secretario.getSalario());
		System.out.println("Salário Engenheiro R$ " + engenheiro.getSalario());
		System.out.println(" ");
		
		System.out.println("===========valor aumento============");
		System.out.println("Bonificação Gerente    R$ " + gerente.getBonificacao());
		System.out.println("Bonificação Diretor    R$ " + diretor.getBonificacao());
		System.out.println("Bonificação Secretario R$ " + secretario.getBonificacao());
		System.out.println("Bonificação Engenheiro R$ " + engenheiro.getBonificacao());
		
	}
}
