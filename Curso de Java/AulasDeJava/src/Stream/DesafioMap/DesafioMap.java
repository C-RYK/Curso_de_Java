package Stream.DesafioMap;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		num.stream().map(n -> Integer.toBinaryString(n)).map(Funções.conv).map(Funções.decimal).forEach(System.out::println);	
	}
}
