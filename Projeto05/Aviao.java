package Projeto05;

public class Aviao {
    String companhia;
	String saida;
	String destino;
	int horas;
	String marca;
	float modelo;
	void decolar() {
		System.out.printf("O avi�o est� decolando\n");
	}
	void companhia(String companhia) 
	{
		this.companhia = companhia;
		System.out.printf("\nCompanhia: %s", companhia);
	}

}
