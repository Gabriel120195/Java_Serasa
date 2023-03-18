package exercicios_o.o_ex_1_4;

public class DataTeste {

	public static void main(String[] args) {
		Data dataAtual = new Data();
		System.out.println("Data do Sistema = " + dataAtual.toString());
		
		System.out.println("=================================");
	
		Data data = new Data(12,01,1995);
		System.out.println("Data Digitada = " + data.toString());
	
		System.out.println("=================================");
		
		data.avancarUmDia();
		System.out.println("Avançando um dia = " + data.toString());
	
	}
}
