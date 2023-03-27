package enums;

public enum Turno {
	MANHA(1,"Manhã"),
	TARDE(2,"Tarde"),
	NOITE(3,"Noite");
	
	private int codigo;
	private String descricao;
	
	Turno(int codigo,String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
