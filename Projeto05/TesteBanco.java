package Projeto05;

public class TesteBanco {
	public static void main(String args[])
	{
		Banco conta = new Banco("45412132","Jose Alberto da Silva",345.99);
		System.out.println("Saldo de R$" + conta.Saque(10.0));
		
	}
}
