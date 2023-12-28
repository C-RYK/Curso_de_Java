package PraticandoJava;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		int esc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dígite um número inteiro e veja seu antecessor e seu sucessor: ");
		esc = entrada.nextInt();
		
		System.out.printf("O antecessor de %d é %d", esc, esc-1);
		
		System.out.printf("\nO sucessor de %d é %d", esc, esc+1);
		
		entrada.close();
	}
}
