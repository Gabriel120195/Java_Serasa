package exercicios_o.o_ex_1_4;

import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if(mes == 2) {
            if (dia > 29)
                throw new IllegalArgumentException("Fevereiro só tem 29 Dias!");
        }
        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("O Mês tem de 1 até 31 dias!");
        }
        this.dia = dia;
        
        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O ano tem entre 1 e 12 Meses!");
        }
        this.mes = mes;
        
        if(ano < 0) throw new IllegalArgumentException("Ano iválido!");
        this.ano = ano;
    }
	
	public Data() {
		LocalDate now = LocalDate.now();
		this.setDia(now.getDayOfMonth());
		this.setMes(now.getMonth().getValue());
		this.setAno(now.getYear());
	}
	
	public String toString() {
		return "Data{" + dia + "/" + mes + "/" + ano + "}";
	}
	
	public void avancarUmDia() {
		this.setDia(this.getDia() + 1);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
