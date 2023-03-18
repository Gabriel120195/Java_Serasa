package cafeteira;

public class CafeteiraTeste {

	public static void main(String[] args) {
		Cafeteira cafeteira = new Cafeteira();
		cafeteira.setMarca("Arno");
		cafeteira.setModelo("A1");
		cafeteira.setTipo("Capsulas");
		
		Cafeteira cafeteira2 = new Cafeteira();
		cafeteira2.setMarca("Philco");
		cafeteira2.setModelo("p123");
		cafeteira2.setTipo("pô");
		
		System.out.println("Cafeteira 1 = " + cafeteira.toString());
		System.out.println("Cafeteira 2 = " + cafeteira2.toString());
		
	}
}
