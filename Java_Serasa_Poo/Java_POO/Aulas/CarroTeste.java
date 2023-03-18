package Aulas;

import javax.swing.JOptionPane;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Fusion";
		carro.fabricante = "Ford";
		carro.cor = "Cinza";
		carro.potenciaCavalos = 200;
		carro.qtdDePortas = 4;
		carro.qtdMarchas = 5;
		carro.temArCondicionado = true;
		
		
		
		System.out.println("Está ligado? " + carro.estaLigado);
		
		carro.ligar(carro.estaLigado);
		
		System.out.println("Está ligado? " + carro.estaLigado);
		
		JOptionPane.showMessageDialog(null, carro.toString());
		//System.out.println(carro.toString());
	}
}
