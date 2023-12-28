package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS Pessoas("
				+ "Codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "Nome VARCHAR(80) NOT NULL"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute(sql);
		
		System.out.println("TABELA CRIADA COM SUCESSO !");
		
		conexao.close();
	}
}
