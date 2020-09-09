package PacoteJava;

import java.util.Scanner;

public class exercicio01 {
	public static void main() {
		int idade, dias, meses, anos;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe os anos: ");
		anos = ler.nextInt();
		System.out.println("Informe os meses: ");
		meses = ler.nextInt();
		System.out.println("Informe os dias: ");
		dias = ler.nextInt();
		idade = anos * 360 + meses * 30 + dias;
		System.out.println("Idade de " + idade + " dias");
	}
}
