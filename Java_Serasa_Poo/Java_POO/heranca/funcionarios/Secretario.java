package heranca.funcionarios;

public class Secretario extends Funcionario {
	
	private int ligacoesAtendidas;
	private String agenda;
	
	
	public Secretario(String nome, String cpf, double salario, String email, int ligacoesAtendidas, String agenda) {
		super(nome, cpf, salario, email);
		this.ligacoesAtendidas = ligacoesAtendidas;
		this.agenda = agenda;
	}

	public int getLigacoesAtendidas() {
		return ligacoesAtendidas;
	}
	
	public void setLigacoesAtendidas(int ligacoesAtendidas) {
		this.ligacoesAtendidas = ligacoesAtendidas;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public double getBonificacao() {
		return getSalario() * 0.25;
	}
}
