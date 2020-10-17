package FORNECEDOR;

public  class  Empregado extends Pessoas{
	private double salario;
	
	public Empregado ( String  nome , String  telefone , String  endereco , double  salario) {
		super(nome,telefone,endereco);
		this.salario = salario;
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
