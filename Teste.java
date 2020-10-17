package FORNECEDOR;

public class Teste {
	public static void main(String[] args ) {
		 
		 	//TESTE FORNECEDOR -----------------------------------------------------------------
			//(String nome, String endereco, String telefone, double valorCredito, double valorDivida)
		 	Fornecedor novo = new Fornecedor("JOANDERSON", "FERNADO", "111-222", 500, 100);
		 	
		 	System.out.println("FORNECEDOR:\n");
		 	
		 	System.out.println("Nome: " + novo.getNome() + "\n"+
		 						"RUA: " + novo.getEndereco() + "\n"+
		 						"Telefone: " + novo.getTelefone()+ "\n"+
		 						"Valor Credito: " + novo.getValorCredito()+ "\n"+
		 						"Valor Divida: " + novo.getValorDivida()+"\n"+
		 						"Total: "+ novo.obterSaldo()+"\n");
		 	
		 	novo.setNome("BETO");
		 	novo.setEndereco("NOLASCO");
		 	novo.setValorCredito(1000);
		 	novo.setValorDivida(50);
		 	
		 	System.out.println("NOVO FORNECEDOR:");
		 	
		 	System.out.println("\nNome: " + novo.getNome() + "\n"+
						"RUA: " + novo.getEndereco() + "\n"+
						"Telefone: " + novo.getTelefone()+ "\n"+
						"Valor Credito: " + novo.getValorCredito()+ "\n"+
						"Valor Divida: " + novo.getValorDivida()+"\n"+
						"Total: "+ novo.obterSaldo()+"\n");
		 	//-----------------------------------------------------------------------------------
		 	//TESTE ADMINISTRADOR ---------------------------------------------------------------
		 	//(String nome, String endereco, String telefone, double salario, double ajudaDeCusto)
		 	
		 	Administrador a = new Administrador("MARIA", "X", "190", 1000, 200);
		 	
		 	System.out.println("SALARIO + AJUDA DE CUSTO -> ADMINISTRADOR:\n");		 	
		 	System.out.println(	"Nome: " + a.getNome() + "\n"+
								"RUA: " + a.getEndereco() + "\n"+
								"Telefone: " + a.getTelefone()+ "\n"+
								"Salario: " + a.getSalario()+"\n"+
		 						"AJUDA DE CUSTO: " +a.getAjudaDeCusto()+"\n"+
		 						"SALARIO + AJUDA DE CUSTO: "+ a.CalcularSalario()+"\n");
		 	a.setNome("BETO");
		 	a.setEndereco("NOLASCO");
		 	a.setSalario(1200);
		 	a.setAjudaDeCusto(500);
		 	
		 	System.out.println("NOVO SALARIO + AJUDA DE CUSTO -> ADMINISTRADOR:\n");
		 	System.out.println(	"Nome: " + a.getNome() + "\n"+
		 						"RUA: " + a.getEndereco() + "\n"+
		 						"Telefone: " + a.getTelefone()+ "\n"+
		 						"Salario: " + a.getSalario()+"\n"+
		 						"AJUDA DE CUSTO: " +a.getAjudaDeCusto()+"\n"+
		 						"SALARIO + AJUDA DE CUSTO: "+ a.CalcularSalario()+"\n");
		 	//-----------------------------------------------------------------------------------
		 	//TESTE VENDEDOR --------------------------------------------------------------------
		 	//( String nome, String endereco, String telefone , double salario, double valorVenda, double porcentagem )
		 	
		 	Vendedor p = new Vendedor("MARIA",  "X","190", 1000, 1000, 0.10);
		 	System.out.println("SALARIO + PORCENTAGEM -> VENDEDOR \n");
		 	System.out.println("Nome: " + p.getNome() + "\n"+
								"RUA: " + p.getEndereco() + "\n"+
								"Telefone: " + p.getTelefone()+ "\n"+
								"SALARIO: " +p.getSalario()+"\n"+
		 						"PORCENTAGEM: "+ p.getPorcentagem()+"\n"+
		 						"SALARIO + PORCENTAGEM: " + p.calculaSalario()+"\n");
		 	p.setNome("BETO");
		 	p.setEndereco("NOLASCO");
		 	p.setSalario(800);
		 	p.setValorVenda(5000);
		 	p.setPorcentagem(0.15);
		 	
		 	System.out.println("NOVO SALARIO + PORCENTAGEM -> VENDEDOR \n");
		 	System.out.println("Nome: " + p.getNome() + "\n"+
		 						"RUA: " + p.getEndereco() + "\n"+
		 						"Telefone: " + p.getTelefone()+ "\n"+
		 						"SALARIO: " +p.getSalario()+"\n"+
		 						"PORCENTAGEM: "+ p.getPorcentagem()+"\n"+
		 						"SALARIO + PORCENTAGEM: " + p.calculaSalario());
		 	
		 	
		 	
		 	
		 	
	}
}
