package FORNECEDOR;

public class Vendedor extends Empregado{
	private double porcentagem;
	private double valorVenda;
	
	public Vendedor ( String nome, String endereco, String telefone , double salario, double valorVenda, double porcentagem ){
		super (nome,  endereco,telefone, salario);
		this.porcentagem = porcentagem;
		this.valorVenda = valorVenda;	
		
	}
	public double calculaSalario() {
		return getSalario()+ valorVenda * porcentagem;
		
	}
	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	

}
