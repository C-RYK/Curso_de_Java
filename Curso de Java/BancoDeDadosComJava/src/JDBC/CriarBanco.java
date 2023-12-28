package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/WM?verifyServeCertificate=False&useSSL=True";
		String usuario = "root";
		String senha = "54544761Chpj";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS Curso_Java");
		
		System.out.println("Banco de dados Criado");
		
		conexao.close();
	}
}
