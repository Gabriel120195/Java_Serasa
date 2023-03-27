package exercicios_o_2.exercicio05;

public class IngressoVip extends Ingresso {
	
	private float valorAdicional;
	
	public IngressoVip() {}

	public IngressoVip(float valorAdicional,Float valor) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "IngressoVip [Valor Ingresso= R$ " + (getValor() + this.valorAdicional) + "]";
	}
}
