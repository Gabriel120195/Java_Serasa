package exercicios_o_2.exercicios_7ate12.entidades;

public class App {
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Papelaria ltds", "Rua tiradentes,1800", 
							"(11)11112222", 5000.00, 2500.00);
		System.out.println("Saldo: R$ " + fornecedor.obterSaldo());
		System.out.println("===========================");
		
		Administrador administrador = new Administrador("Laura silva", "Av pedro mendes", 
								"(11)44756585", 005, 2500, 0, 700);
		System.out.println("Administado = Salário: R$ " + administrador.calcularSalario());
		System.out.println("===========================");
		
		Operario operario = new Operario("Gabriel", "Av casa grande", "(11)42361234", 
										053, 4000, 5, 2000);
		System.out.println("Operario = Salário: R$ " + operario.calcularSalario());
		System.out.println("===========================");
		
		Vendedor vendedor = new Vendedor("Sandra", "Av prestes maia,123", "(11)02010304"
										, 8, 2500, 5, 500000);
		System.out.println("Vendedor = Salário: R$ " + vendedor.calcularSalario());
		
		System.out.println(vendedor.getComissao());
		
	}
}
