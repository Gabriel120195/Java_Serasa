package exercicios_o_2.exercicios_7ate12.entidades;

public class Operario extends Empregado{
	
	private double valorProduto;
	private double comissao;
	
	
	public Operario(){}
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProduto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProduto = valorProduto;
	}
	
	@Override
	public double calcularSalario() {
		
		return getSalarioBase() + getComissao() - (getSalarioBase() * (getImposto() / 100));
	}


	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao() {
		this.comissao = (comissao + this.valorProduto) * (15/100);
	}
}
