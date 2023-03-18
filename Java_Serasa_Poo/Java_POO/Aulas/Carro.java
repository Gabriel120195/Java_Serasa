package Aulas;

public class Carro {
	String modelo;
	String fabricante;
	String cor;
	int qtdDePortas;
	int potenciaCavalos;
	double velocidadeMaxima;
	int qtdMarchas;
	boolean temArCondicionado;
	boolean estaLigado = false;
	
	public void ligar(boolean estaLigado) {
		if (estaLigado == false) {
			this.estaLigado = true;
		} 
	}
	public void desligar(boolean estaLigado) {
		if (estaLigado == true) {
			this.estaLigado = false;
		}
	}
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ",\n fabricante=" + fabricante + ",\n cor=" + cor + ",\n qtdDePortas="
				+ qtdDePortas + ",\n potenciaCavalos=" + potenciaCavalos + ",\n velocidadeMaxima=" + velocidadeMaxima
				+ ",\n qtdMarchas=" + qtdMarchas + ",\n temArCondicionado=" + temArCondicionado + ",\n estaLigado="
				+ estaLigado + "]";
	}
}
