package heranca.funcionarios;

public class Diretor extends Funcionario {
	
	private String superSenha;
	private int reunioesRealizadas;
	
	
	public Diretor(String nome, String cpf, double salario, String email, String superSenha, int reunioesRealizadas) {
		super(nome, cpf, salario, email);
		this.superSenha = superSenha;
		this.reunioesRealizadas = reunioesRealizadas;
	}

	public String getSuperSenha() {
		return superSenha;
	}

	public void setSuperSenha(String superSenha) {
		this.superSenha = superSenha;
	}

	public int getReunioesRealizadas() {
		return reunioesRealizadas;
	}

	public void setReunioesRealizadas(int reunioesRealizadas) {
		this.reunioesRealizadas = reunioesRealizadas;
	}
	public double getBonificacao() {
		return getSalario() * 0.20;
	}
}
