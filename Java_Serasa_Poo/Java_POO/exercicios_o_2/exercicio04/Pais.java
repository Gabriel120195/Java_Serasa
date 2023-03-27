package exercicios_o_2.exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
	
	private String codigoIso;
	private String nome;
	private long populacao;
	private double dimensao;
	
	
	private List<String> paisesFronteiricos = new ArrayList<>();
	
	
	public Pais(String codigoIso, String nome, double dimensao) {
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	
	public boolean isLimitrofe(String pais) {
		
		return getPaisesFronteiricos().contains(pais);
	}
	
	public double getDensidadePopulacional() {
		return this.populacao / this.dimensao;
	}
	

	public String getCodigoIso() {
		return codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public List<String> getPaisesFronteiricos() {
		return paisesFronteiricos;
	}
	public void setPaisesFronteiricos(List<String> paisesFronteiricos) {
		this.paisesFronteiricos = paisesFronteiricos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoIso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigoIso, other.codigoIso);
	}
}
