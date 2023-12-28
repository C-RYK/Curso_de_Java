package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistros2 {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Codigo do nome: ");
		int codigo = entrada.nextInt();
		
		String selectSQL = "SELECT * FROM pessoas WHERE Codigo = ?";
		
		String updateSQL = "UPDATE Pessoas SET Nome = ? WHERE Codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		
		ResultSet r = stmt.executeQuery();
		
		System.out.println();
		
		if(r.next()) {
			
			Pessoa p = new Pessoa(r.getString(2), r.getInt(1));
			
			System.out.println("O nome atual é " + p.getNome());
			
			entrada.nextLine();
			
			System.out.println();
			
			System.out.print("Atualizar nome: ");
			String novoNome = entrada.nextLine();
		
		
			PreparedStatement stm = conexao.prepareStatement(updateSQL);
			stm.setString(1, novoNome);
			stm.setInt(2, codigo);
		
			stm.execute();
		
			System.out.println();
		
			System.out.println("Atualização feita com sucesso !");
		
			entrada.close();
			conexao.close();
		
		}else {
			System.out.println("Nome não encontrado !");
		}
	}
}
