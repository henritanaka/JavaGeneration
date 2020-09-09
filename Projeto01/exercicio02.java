package PacoteJava;

import java.util.Scanner;
public class exercicio02 {
	public static void main(String arg[]) {
		int idade, dias, meses, anos;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número de dias: ");
		idade = ler.nextInt();
		anos = idade/365;
		meses = (idade % 365) / 30;
		dias = meses % 30;
		System.out.println(dias + " dia(s) " + meses + " mes(es) " + anos + " ano(s). ");
		
	}

}
