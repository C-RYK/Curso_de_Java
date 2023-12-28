package Teste.UmPraMuitos;

import Infra.DAO;
import Modelo.Basico.Produto;
import Modelo.UmPraMuitos.ItemPedido;
import Modelo.UmPraMuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		
		Produto produto = new Produto("PS5", 5000.00);
		
		ItemPedido item = new ItemPedido(pedido, produto, 1);
		
		dao.abrirT().incluir(produto).incluir(item).incluir(pedido).fecharT().fechar();
	}
}
