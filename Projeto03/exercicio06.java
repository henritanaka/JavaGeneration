package Projeto03;


/*                  Exerc�cios de Repeti��o  
 *   6) Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
 *   final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
 *   0(zero).(DO...WHILE)*/


import java.util.*;
public class exercicio06 {
	public static void main(String args[]) {
		int n, soma = 0, qtd = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.printf("Informe um valor: ");
			n = entrada.nextInt();
			if (n % 3 == 0) {
				soma = soma + n;
				qtd = qtd + 1;
			}
		}while (n != 0);
		 System.out.printf("A media de todos os n�mero multiplos de 3 = %.1f", (float) soma / (qtd-1)); /*Corresponde a 0 % 3*/
		 System.out.printf("\nFim do Programa");
		} 
}