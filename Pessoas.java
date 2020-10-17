package FORNECEDOR;

public class Pessoas {
	private String nome;
	private String endereco;
	private String telefone;
	
	
	
	public Pessoas(String p_nome, String p_endereco, String p_telefone) {
		this.nome = p_nome;
		this.endereco = p_endereco;
		this.telefone = p_telefone;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	
}
