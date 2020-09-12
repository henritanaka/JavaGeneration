package Projeto04;


/*                                 LISTA ARRAYS
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
 * menu de opções:
 * (1) somar as duas matrizes
 * (2) subtrair a primeira matriz da segunda
 * (3) adicionar uma constante as duas matrizes
 * (4) imprimir as matrizes*/
import java.util.*;
public class exercicio04 {
	public static void main(String args[]) 
	{
		int opcao, linha, coluna, sinal, constante;
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		Scanner entrada = new Scanner(System.in);
		for (linha = 0; linha < 2; linha++) 
		{
			for (coluna = 0; coluna < 2; coluna++) 
			{
				System.out.printf("Informe Matriz 01 [%d][%d]: ", linha + 1, coluna + 1);
				matriz1[linha][coluna] = entrada.nextFloat();
			}
		}
		for (linha = 0; linha < 2; linha++) 
		{
			for (coluna = 0; coluna < 2; coluna++) 
			{
				System.out.printf("Informe Matriz 02 [%d][%d]: ", linha + 1, coluna + 1);
				matriz2[linha][coluna] = entrada.nextFloat();
			}
		}
		do{
			System.out.print("\n___________________________________________________________________________________________");
			System.out.print("\nInforme uma das opções: ");
			System.out.print("\n(1)Somar as matrizes");
			System.out.print("\n(2)Subtrair a primeira matriz da segunda");
			System.out.print("\n(3)Adicionar uma constante as matrizes");
			System.out.print("\n(4)Imprimir as matrizes");
			System.out.print("\n(5)Sair");
			System.out.print("\n\tOpção: ");
			opcao = entrada.nextInt();
			while (opcao < 1 || opcao > 5)
			{
				System.out.print("\n\tValor inválido. Digite opção novamente: ");
				opcao = entrada.nextInt();
			}
			if (opcao == 1 || opcao == 2) 
			{
				if(opcao == 1) {sinal =1;}
				else {sinal = -1;}
				for (linha = 0; linha < 2; linha++)
				{
					for (coluna = 0; coluna < 2; coluna++)
					{
						System.out.printf("\t[ %.1f ]", matriz2[linha][coluna] + matriz1[linha][coluna] * sinal);
					}System.out.print("\n");
				}
			}
			if (opcao == 3 || opcao == 4)
			{
				if (opcao == 4) {constante = 0;}
				else
				{
					System.out.print("Informe o valor da constante: ");
					constante = entrada.nextInt();	
				}
				System.out.print("\nMatriz 01: \n");
				for (linha = 0; linha < 2; linha++)
				{
					for (coluna = 0; coluna < 2; coluna++)
					{
						System.out.printf("\t[ %.1f ]", matriz1[linha][coluna] + constante);
					}System.out.print("\n");
				}
				System.out.print("\nMatriz 02: \n");
				for (linha = 0; linha < 2; linha++)
				{
					for (coluna = 0; coluna < 2; coluna++)
					{
						System.out.printf("\t[ %.1f ]", matriz2[linha][coluna] + constante);
					}System.out.print("\n");
				}
			}
			
		}while(opcao != 5);
		System.out.print("________________________________________________________________________________________________");
		System.out.print("\n\nFim do Programa");
	}

}
