package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao{

	public static void main(String[] args) throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/Praticas_Programacao?verifyServeCertificate=False&useSSL=True";
		String usuario = "root";
		String senha = "54544761Chpj";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão feita com sucesso !");
		
		conexao.close();
	}
}
