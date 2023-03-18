package heranca.funcionarios;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String email;
	
	public Funcionario(String nome, String cpf, double salario,String email) {	
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
}
