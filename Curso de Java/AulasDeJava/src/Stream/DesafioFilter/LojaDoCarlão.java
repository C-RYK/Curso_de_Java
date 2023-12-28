package Stream.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LojaDoCarlão {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2260, 0.15);
		Produto p2 = new Produto("Teclado", 250, 0.18);
		Produto p3 = new Produto("Mouse", 100, 0.07);
		Produto p4 = new Produto("Monitor", 1500, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> preco = p -> p.preco > 999;
		Predicate<Produto> desconto = p -> p.desconto > 0.10;
		
		produtos.stream().filter(preco).filter(desconto).map(n -> "O produto: " + n.nome + " está saindo com desconto de " + n.desconto + "% " + "ficando pelo preço de R$" + (n.preco - (n.preco * n.desconto))).forEach(System.out::println);	
	}
}
