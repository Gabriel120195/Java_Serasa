package exercicios_o_2.exercicios_7ate12.entidades;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;
	
	public Administrador() {}

	public Administrador(String nome, String endereco, String telefone,int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome,endereco,telefone,codigoSetor,salarioBase,imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + ajudaDeCusto - (getSalarioBase() * (getImposto() / 100));
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
