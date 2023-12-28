package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistroPessoa {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = entrada.nextLine();
		
		String sql = "INSERT INTO Pessoas(Nome)"
				+ "VALUES(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso !");
		
		entrada.close();
		conexao.close();
		
	}
}
