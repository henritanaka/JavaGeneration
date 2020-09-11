package Projeto03;

/*                       Exerc�cio de Repeti��o
 *   4) Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
 *   psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
 *   era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
 *   (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 *   agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 *   pessoas, calcule e mostre: (WHILE)
 *   o n�mero de pessoas calmas;
 *   o n�mero de mulheres nervosas;
 *   o n�mero de homens agressivos;
 *   o n�mero de outros calmos;
 *   o n�mero de pessoas nervosas com mais de 40 anos;
 *   o n�mero de pessoas calmas com menos de 18 anos.*/

import java.util.*;
public class exercicio04 {
	public static void main(String args[]) {
		int idade, sexo, opcao,  contador = 1, calmas = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, nervosa40 = 0, calmas18 = 0;
		Scanner entrada = new Scanner(System.in);
		while (contador <= 150 ) {
			System.out.printf("----------------------------------------------\n");
			System.out.printf("Indiv�duo N�: %d. Informe a idade: ", contador);
			idade = entrada.nextInt();
			while (idade < 0 || idade > 120) {
				System.out.print("Valor inv�lido. Informe a idade novamente: ");
				idade = entrada.nextInt();
			}
			System.out.print("Informe o sexo (1-Feminino/2-Masculino/3-Outros): ");
			sexo = entrada.nextInt();
			while(sexo < 1 || sexo > 3) {
				System.out.print("Valor inv�lido. Informe o sexo novamente (1-Feminino/2-Masculino/3-Outros): ");
				sexo = entrada.nextInt();
			}
			System.out.print("Informe a op��o (1-Calma/2-Nervosa/3-Agressiva): ");
			opcao = entrada.nextInt();
			while (opcao < 1 || opcao > 3) {
				System.out.print("Valor inv�lido. Informe a op��o novamente (1-Calma/2-Nervosa/3-Agressiva): ");
				opcao = entrada.nextInt();
			}
			if (sexo == 1 && opcao == 2) {
				mulherNervosa ++;
			}
			if (opcao == 2 && idade > 40) {
				nervosa40 ++;
			}
			if (sexo == 2 && opcao == 3) {
				homemAgressivo ++;
			}
			if (opcao == 1) {
				calmas++;
				if (sexo == 3) {
					outrosCalmos ++;
				}
				if (idade < 18) {
					calmas18 ++;
				}
			}
			contador ++;
			
			
		} System.out.printf("\nTemos os seguintes dados: \n");
		  System.out.printf("\t N�mero de pessoas calmas = %d\n ", calmas);
		  System.out.printf("\t N�mero de mulheres nervosas = %d\n ", mulherNervosa);
		  System.out.printf("\t N�mero de homens agressivos = %d\n ",  homemAgressivo);
		  System.out.printf("\t N�mero de outros calmos = %d\n ", outrosCalmos);
		  System.out.printf("\t N�mero de pessoas nervosas com mais de 40 anos = %d\n ", nervosa40);
		  System.out.printf("\t N�mero de pessoas calmas com menos de 18 anos = %d\n ", calmas18);
		  System.out.print("\nFim do programa");
		  
		
	}
}
