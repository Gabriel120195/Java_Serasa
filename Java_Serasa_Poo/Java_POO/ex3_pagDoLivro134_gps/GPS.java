package ex3_pagDoLivro134_gps;

public class GPS {
	
	private String idioma;
	private String rota;
	
	public GPS(){}
	
	public GPS(String idioma, String rota) {
		this.idioma = "Portugues";
		this.rota = " ";
	}
	
	public void mostrar() {
		System.out.println("Idioma Gps = " + this.idioma);
		System.out.println("Rota Gps = " + this.rota);
	}
	
	public String definirIdioma() {
		return this.idioma = getIdioma();
	}
	
	public String definirRota() {
		return this.rota = getRota();
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}
}
