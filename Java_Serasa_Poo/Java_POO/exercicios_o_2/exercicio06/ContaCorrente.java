package exercicios_o_2.exercicio06;

public class ContaCorrente extends Cliente{
	
	protected float saldo;
	
	public ContaCorrente(){}

	public ContaCorrente(String nome, float saldo) {
		super(nome);
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
		System.out.println("Deposito Realizado!");
	}
	
	public boolean sacar(float valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente para saque!");
			return false;
		} else {
			this.saldo = valor - saldo;
			return true;
		}
	}
	
	public boolean transferiri() {
		
		return true;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + ", getNome()=" + getNome() + "]";
	}
}
