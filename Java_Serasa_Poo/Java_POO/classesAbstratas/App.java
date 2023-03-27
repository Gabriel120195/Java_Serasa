package classesAbstratas;

public class App {

	public static void main(String[] args) {
		
		Automovel automovel = new Automovel();
		Aviao aviao = new Aviao();
		
		System.out.println("status automovel = " + automovel.isStatus());
		automovel.ligar();
		System.out.println("status automovel = " + automovel.isStatus());
		
		System.out.println("Velocidade automovel = " + automovel.getVelocidade() + " Km/h");
		automovel.acelerar();
		automovel.acelerar();
		automovel.acelerar();
		automovel.acelerar();
		System.out.println("Velocidade automovel = " + automovel.getVelocidade() + " Km/h");
		
		System.out.println("===================");
		
		System.out.println("Status aviao = " + aviao.isStatus());
		aviao.ligar();
		System.out.println("Status aviao = " + aviao.isStatus());
		
		System.out.println("Velocidade aviao = " + aviao.getVelocidade() + " Km/h");
		aviao.acelerar();
		aviao.acelerar();
		aviao.acelerar();
		aviao.acelerar();
		System.out.println("Velocidade aviao = " + aviao.getVelocidade() + " Km/h");


	}

}
