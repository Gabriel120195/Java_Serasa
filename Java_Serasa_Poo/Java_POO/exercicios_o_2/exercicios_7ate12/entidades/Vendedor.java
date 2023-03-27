package exercicios_o_2.exercicios_7ate12.entidades;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;
	
	
	public Vendedor(){}
		
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
	}
	
	@Override
	public double calcularSalario() {
		
		return getSalarioBase() + getComissao() - (getSalarioBase() * (getImposto() / 100));
	}


	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao = this.valorVendas;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
