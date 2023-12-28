package Teste.Basico;

import java.util.List;

import Infra.ProdutoDAO;
import Modelo.Basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto p: produtos) {
			System.out.println("ID: " + p.getId() + " - " + "Nome: " + p.getNome() + " - R$ " + p.getPreco());
		}
	}
}
