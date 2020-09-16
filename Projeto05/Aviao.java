package Projeto05;

public class Aviao {
    String companhia;
	String saida;
	String destino;
	int horas;
	String marca;
	float modelo;
	void decolar() {
		System.out.printf("O avião está decolando\n");
	}
	void companhia(String companhia) 
	{
		this.companhia = companhia;
		System.out.printf("\nCompanhia: %s", companhia);
	}

}
