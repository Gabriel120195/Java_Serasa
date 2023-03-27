package exercicios_o_2.exercicio06;

public class ContaEspecial extends ContaCorrente{
	
	private float limite;

	public ContaEspecial(){}

	public ContaEspecial(String nome, float saldo, float limite) {
		super(nome, saldo);
		this.limite = limite;
		
	}

	@Override
	public boolean sacar(float valor) {
		if (valor > limite) {
			System.out.println("Impossivel realizar saque, o valor é maior que seu limite!");
			return false;
		} else {
			this.saldo = saldo - valor;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", saldo=" + saldo + ", getNome()=" + getNome() + "]";
	}
}
