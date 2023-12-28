package Stream.DesafioMap2;

import java.util.Arrays;
import java.util.List;

public class DesafioMap2 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numsB = Arrays.asList(1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010);
		
		System.out.println("Convertendo valores decimais para binarios:");
		for (Integer integer : nums) {
			Funções2.binary(integer);
		}
		
		System.out.println("");
		
		System.out.println("Invertendo valores binarios:");
		for (Integer integer : nums) {
			String binary = Integer.toBinaryString(integer);
			StringBuilder str = new StringBuilder(binary);
			binary = str.reverse().toString();
			System.out.println(binary);
		}
		
		System.out.println();
		
		System.out.println("Convertendo valores binarios para decimais:");
		for (Integer integer : numsB) {
			String conv = integer.toString();
			int numero = Integer.parseInt(conv, 2);
			System.out.println(numero);
		}
	}
}
