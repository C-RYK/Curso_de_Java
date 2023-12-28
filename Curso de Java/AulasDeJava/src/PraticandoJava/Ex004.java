package PraticandoJava;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		double salario;
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioMinimo = 788.00;
		
		System.out.print("Dígite seu salario e veja quantos salarios minimos você ganha: ");
		salario  = entrada.nextDouble();
		
		double cal = Math.round(salario / salarioMinimo);
		
		if(cal > 1) {
			System.out.printf("O seu salario é equivalente a %.0f salarios minimos", cal);
		}else {
			System.out.printf("O seu salario é equivalente a %.0f salario minimo", cal);
		}
		
		entrada.close();
	}
}
