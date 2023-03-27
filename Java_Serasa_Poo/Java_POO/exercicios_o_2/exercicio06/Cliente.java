package exercicios_o_2.exercicio06;

public class Cliente {
	private String nome;
	
	public Cliente() {}
	
	public Cliente(String nomeCliente) {
		this.nome = nomeCliente;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome= " + nome + "]";
	}
}
