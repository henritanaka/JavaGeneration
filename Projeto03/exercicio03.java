package Projeto03;

/*                          Exerc�cio de Repeti��o
 *   3) Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
 *   21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
 *   idade for =-99. (WHILE)*/


import java.util.*;
public class exercicio03 {
	public static void main(String args[]) {
		int idade, menos21 = 0, mais50 = 0, contador = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			contador ++;
			System.out.printf("Informe a %d� idade: ", contador);
			idade = entrada.nextInt();
			while ((idade<=0 || idade>120) && idade!=-99 ) {
				System.out.printf("\nValor inv�lido. Informe a %d� idade novamente: ", contador);
				idade = entrada.nextInt();
			}
			if (idade < 21 && idade != -99)
			{
				menos21++;
			}
			if (idade>50)
			{
				mais50++;
			}
			
		}while(idade != -99);
		System.out.print("-------------------------------------------------------------------------------------------\n");
		System.out.printf("Temos %d pessoa(s) com menos de 21 anos e %d pessoa(s) com mais de 50 anos\n", menos21, mais50);
	    System.out.printf("Fim do programa");
			
		
	}
}
