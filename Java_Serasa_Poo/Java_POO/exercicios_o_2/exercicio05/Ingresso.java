package exercicios_o_2.exercicio05;

public class Ingresso {
	
	private float valor;

	public Ingresso() {};
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	
	

	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Ingresso [Valor Ingresso= R$ " + valor + "]";
	}
}
