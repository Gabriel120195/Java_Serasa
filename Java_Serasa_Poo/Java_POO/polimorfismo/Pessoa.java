package polimorfismo;

public class Pessoa {
	
	private String nome;

	public Pessoa(){}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void mostrarClasse() {
		System.out.println("Classe: " + this.getClass().getSimpleName());
	}
}
