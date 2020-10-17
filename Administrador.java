package FORNECEDOR;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, double salario, double ajudaDeCusto) {
		super(nome, endereco, telefone, salario);
		this.ajudaDeCusto = ajudaDeCusto;
		
	}
	public double CalcularSalario() {
		return this.getSalario() + ajudaDeCusto;
	
		
	}
	
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

}
