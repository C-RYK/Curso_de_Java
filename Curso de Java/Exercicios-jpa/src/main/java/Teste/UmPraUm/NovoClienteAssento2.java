package Teste.UmPraUm;

import Infra.DAO;
import Modelo.UmPraUm.Assento;
import Modelo.UmPraUm.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento  = new Assento("15C");
		
		Cliente cliente = new Cliente("João Vitor", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.incluirAtomico(cliente);
	}
}
