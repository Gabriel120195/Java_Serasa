package exercicios_o.o_ex_1_3;

public class Empregado {
	 private String primeiroNome;
	    private String segundoNome;
	    private float salario;

	    public Empregado (String primeiroNome,String segundoNome,float salario){

	        this.primeiroNome = primeiroNome;
	        this.segundoNome = segundoNome;

	        if (salario < 0) {
	            this.salario = 0.0f;
	        } else {
	            this.salario = salario;
	        }
	        
	    }

	    public String getPrimeiroNome() {
	        return primeiroNome;
	    }

	    public void setPrimeiroNome(String primeiroNome) {
	        this.primeiroNome = primeiroNome;
	    }

	    public String getSegundoNome() {
	        return segundoNome;
	    }

	    public void setSegundoNome(String segundoNome) {
	        this.segundoNome = segundoNome;
	    }

	    public float getSalario() {
	        return salario;
	    }

	    public void setSalario(float salario) {
	        this.salario = salario;
	    }

	    public float getSalarioAnual() {
	        return getSalario() * 12;
	    }

	    public void setAumentoSalario() {
	        float salarioComAumento = getSalario() + getSalario() * 0.10f;
	        this.setSalario(salarioComAumento);
	    }
}
