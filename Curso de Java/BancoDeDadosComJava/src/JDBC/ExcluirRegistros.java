package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistros {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o codigo: ");
		int codigo = entrada.nextInt();
		
		String sql = "DELETE FROM Pessoas WHERE Codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			
			System.out.println("Pessoa excluida com sucesso");
		}else {
			System.out.println("Codigo não encontrado !");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		entrada.close();
		conexao.close();
	}
}
