package Excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		try {
			System.out.println(7 / num);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally #01...");
		}
		
		try {
			System.out.println(7 / num);
		}finally {
			System.out.println("Finally #02...");
			entrada.close();
		}
		
		System.out.println("Fim!");
	}
}
