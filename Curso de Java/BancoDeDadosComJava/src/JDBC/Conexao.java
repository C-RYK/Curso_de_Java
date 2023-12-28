package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		
		try {
			final String url = "jdbc:mysql://localhost:3306/praticas_programacao?verifyServeCertificate=False&useSSL=True";
			final String usuario = "root";
			final String senha = "54544761Chpj";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
				throw new RuntimeException(e);
		}
	}
}
