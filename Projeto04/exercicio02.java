package Projeto04;

/*                 LISTA DE ARRAYS
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
 * � Os n�meros pares digitados;
 * � A soma dos n�meros pares digitados;
 * � Os n�meros �mpares digitados;
 * � A quantidade de n�meros �mpares digitados.*/


import java.util.*;
public class exercicio02 {
	public static void main(String args[]) {
		int numero, soma = 0, contador, qtdpar = 0, qtdimpar = 0;
		int matriz [] = new int [6];
		ArrayList <Integer> pares = new ArrayList();
		ArrayList <Integer> impares = new ArrayList();
		Scanner entrada = new Scanner(System.in);
		for (contador = 0; contador < 6; contador++) 
		{
			System.out.printf("Informe o %d� N�mero: ", contador+1);
			numero = entrada.nextInt();
			matriz[contador] = numero;
			if (numero % 2 == 0) 
			{ 
				pares.add(numero);
				soma += numero;
				qtdpar ++;
			}
			else 
			{
				impares.add(numero);
				qtdimpar ++;
			}
		}
		System.out.printf("_______________________________________________________");
		System.out.printf("\nTemos: ");
		System.out.printf("\n\tLista(6): ");
		for (int i : matriz) 
		{
			System.out.printf("%d, ", i);
		}
		System.out.printf("\n\tPares(%d): ", qtdpar);
		for (int i : pares) 
		{
			System.out.printf("%d + ", i);
		}
		System.out.printf(" = %d", soma);
		System.out.printf("\n\t�mpares(%d): ", qtdimpar);
		for (int i : impares) 
		{
			System.out.printf("%d, ", i);
		}
		System.out.printf("\nFim do programa");
		
	}
}
