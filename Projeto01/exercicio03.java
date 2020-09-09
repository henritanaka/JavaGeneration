package PacoteJava;

import java.util.Scanner;
public class exercicios03 {
	public static void main(String arg[]) {
		int tempo, minutos, segundos, horas;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número de segundos: ");
		tempo = ler.nextInt();
		horas = tempo/3600;
		minutos = (tempo%3600)/60;
		segundos = tempo % 60;
		System.out.println(horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s)");
		
	}
}
