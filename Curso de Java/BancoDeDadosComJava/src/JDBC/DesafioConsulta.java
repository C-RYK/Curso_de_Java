package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsulta {

	public static void main(String[] args) throws SQLException{
		
		Connection conexao = Conexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Pesquisar nome por caractere: ");
		String caractere = entrada.nextLine();
		
		String sql = "SELECT * FROM Pessoas WHERE Nome LIKE '%" + caractere + "%'";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
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
		
		stmt.close();
		conexao.close();
		
		entrada.close();
		conexao.close();
	}
}
