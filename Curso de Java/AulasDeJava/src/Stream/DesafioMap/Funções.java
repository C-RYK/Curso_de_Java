package Stream.DesafioMap;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Funções {
	
	StringBuilder str = new StringBuilder();
	
	static UnaryOperator<String> conv = n -> n = new StringBuilder(n).reverse().toString();
	
	static Function<String, Integer> decimal = n -> Integer.parseInt(n, 2);
}
