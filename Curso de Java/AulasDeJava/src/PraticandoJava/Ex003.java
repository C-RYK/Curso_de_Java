package PraticandoJava;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu saldo bancario e veja com reajuste de 1%: ");
		saldo = entrada.nextDouble();
		
		double cal = (saldo * 0.01) + saldo;
		
		System.out.printf("O valor do seu saldo reajustado em 1 por cento fica R$%.2f", cal);
		
		entrada.close();
	}
}
