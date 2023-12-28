package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	 @SuppressWarnings("unused")
	private String sql;
	 
	 @SuppressWarnings("unused")
	private String nome;
	 
	 @SuppressWarnings("unused")
	private int codigo;
	
	 public void consulta(String sql, String nome) throws SQLException {
		 
		 Connection conexao = Conexao.getConexao();
		 
		 this.sql = sql;
		 this.nome = nome;
		 
		 PreparedStatement stmt = conexao.prepareStatement(sql);
		 stmt.setString(1, nome);
		 
		 stmt.execute();
		 
		 stmt.close();
		 conexao.close();
		 
	 }
	 
	 public void consultaUpdate(String sql, String nome, int codigo) throws SQLException {
		 
		 Connection conexao = Conexao.getConexao();
		 
		 this.sql = sql;
		 this.nome = nome;
		 this.codigo = codigo;
		 
		 PreparedStatement stmt = conexao.prepareStatement(sql);
		 stmt.setString(1, nome);
		 stmt.setInt(2, codigo);
		 
		 stmt.execute();
		 
		 stmt.close();
		 conexao.close();
		 
	 }
	 
	 public void consultaSelect(String sql) throws SQLException {
		 
		 Connection conexao = Conexao.getConexao();
		 
		 this.sql = sql;
		 
		 Statement stmt = conexao.createStatement();
		 ResultSet resultado = stmt.executeQuery(sql);
			
		 List<Pessoa> pessoas = new ArrayList<>();
			
		 while(resultado.next()) {
			 int codigo = resultado.getInt("codigo");
			 String nome = resultado.getString("nome");
			 pessoas.add(new Pessoa(nome, codigo));
		 }
			
		 for(Pessoa p: pessoas) {
			 System.out.println(p.getCodigo() + " - " + p.getNome());
			 
		 }
	 }
}
