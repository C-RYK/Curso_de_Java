package PraticandoJava;

import java.util.Random;

public class Matrix {

	public static void main(String[] args) {
		
		Random sort = new Random();
		
		for(int num = 0; num <= 1; --num) {
			System.out.println(" ");
			for(int num2 = 0; num2 <= 100; num2++) {
				System.out.print(sort.nextInt(2) + " ");
			}
		}
	}
}
