package Teste.Basico;

import Infra.DAO;
import Modelo.Basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Mouse Pad", 59.99);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		dao.abrirT().incluir(produto).fechar();;
		
		System.out.println("ID do produto cadastrado: " + produto.getId());
	}
}
