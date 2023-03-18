package heranca.funcionarios;

public class Engenheiro extends Funcionario {
	
	private String crea;
	private String cee;
	
	public Engenheiro(String nome, String cpf, double salario, String email, String crea, String cee) {
		super(nome, cpf, salario, email);
		this.crea = crea;
		this.cee = cee;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	public String getCee() {
		return cee;
	}

	public void setCee(String cee) {
		this.cee = cee;
	}
	public double getBonificacao() {
		return getSalario() * 0.40;
	}
}
