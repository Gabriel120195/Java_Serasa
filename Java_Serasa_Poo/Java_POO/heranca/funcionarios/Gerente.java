package heranca.funcionarios;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	public Gerente(String nome, String cpf, double salario, String email, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario,email);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public double getBonificacao() {
		return getSalario() * 0.30;
	}
}