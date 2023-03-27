package ex_Enums_Aula;

public enum Sexo {
	MASCULINO("Masculino"),
	FEMINIO("Feminino");
	
	private String sexo;
	
	private Sexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
}
