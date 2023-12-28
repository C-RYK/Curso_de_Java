package PraticandoJava;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		
		System.out.println("Dígite sua idade atual em anos, meses e dias."
				+ " Exemplo: 25 anos, 3 meses e 15 dias");
		
		System.out.print("Dígite os anos: ");
		anos = entrada.nextInt();
		
		System.out.print("Dígite os meses: ");
		meses = entrada.nextInt();
		
		System.out.print("Dígite os dias: ");
		dias = entrada.nextInt();
		
		int cal1 = anos * 365;
		int cal2 = meses * 30;
		
		int totalDias = cal1 + cal2 + dias;
		
		System.out.printf("O total de dias que representa a idade digitada é %d dias", totalDias);
		
		entrada.close();
	}
}
