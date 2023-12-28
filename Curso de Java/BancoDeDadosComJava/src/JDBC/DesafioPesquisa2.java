package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioPesquisa2 {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Pesquisar nome por caractere: ");
		String caractere = entrada.nextLine();
		
		String sql = "SELECT * FROM Pessoas WHERE Nome LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, '%' + caractere + '%');
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(nome, codigo));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println();
			System.out.println(p.getCodigo() + " - " + p.getNome());
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
