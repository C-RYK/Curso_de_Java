package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistros {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Novo nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Codigo - nome antigo: ");
		int codigo = entrada.nextInt();
		
		String sql = "UPDATE Pessoas SET Nome = ? WHERE Codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setNString(1, nome);
		stmt.setInt(2, codigo);
		
		stmt.execute();
		
		System.out.println("Atualização feita com sucesso !");
		
		entrada.close();
		conexao.close();
	}
}
