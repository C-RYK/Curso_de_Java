package JDBC;

public class Pessoa {

	private String nome;
	private int codigo;
	
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public int getCodigo() {
		
		return codigo;
	}
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}
	
	public Pessoa(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
}
