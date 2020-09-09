package Projeto02;

import java.util.*;
public class exercicio04 {
	public static void main(String args[]) {
	double n;
	Scanner ler = new Scanner(System.in);
	System.out.printf("Informe N: ");
	n = ler.nextDouble();
	  if (n % 2 == 0) {
		  System.out.printf("%.0f", Math.pow(n, 0.5));
	  }else {
		  System.out.printf("%.0f", Math.pow(n, 2));
	  }
	}
}
