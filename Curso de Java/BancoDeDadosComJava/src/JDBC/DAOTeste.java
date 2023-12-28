package JDBC;

import java.sql.SQLException;

public class DAOTeste {

	public static void main(String[] args) throws SQLException {
		
		DAO dao = new DAO();
		
		dao.consultaSelect("SELECT * FROM Pessoas");
		
		System.out.println();
		
		System.out.println("Consulta realizada !");
	}
}
