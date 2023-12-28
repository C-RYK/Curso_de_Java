package Teste.UmPraUm;

import Infra.DAO;
import Modelo.UmPraUm.Assento;
import Modelo.UmPraUm.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("5A");
		
		Cliente cliente = new Cliente("Carlos Henrique", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
	}
}
