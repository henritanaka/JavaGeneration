package Projeto05;

public class ClienteTeste {
	public static void main(String args[]) 
	{
		Cliente dados = new Cliente("Joao", "caixa", 3);
		System.out.printf(dados.getInformacao());
	}

}
