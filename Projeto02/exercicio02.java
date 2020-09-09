package Projeto02;

import java.util.*;
public class exercicio02 {
	public static void main(String args[]) {
		float n1, n2, n3, a;
		Scanner ler = new Scanner(System.in); 
		System.out.println("Informe N1: ");
		n1 = ler.nextFloat();
		System.out.println("Informe N2: ");
		n2 = ler.nextFloat();
		System.out.println("Informe N3: ");
		n3 = ler.nextFloat();
		if (n1>n2) {
			a = n1;
			n1 = n2;	
			n2 = a;
		}if (n2>n3) {
			a = n2;
			n2 = n3;
			n3 = a;
			
		}if (n1>n2) {
			a = n1;
			n1 = n2;	
			n2 = a;
		}System.out.printf("Temos a seguinte ordem: %.1f %.1f %.1f", n1, n2, n3);
	}
}
