package entrega;

public class AdministradorTeste {
	public static void main(String args[])
	{
		Administrador joao = new Administrador("Joâo", "Rua dos Imigrantes", "095465322", 419922055, 
				40, 2000.00, 5000.00, 3);
		joao.infoAdm();
		joao.salarioFinal();
		System.out.printf("%s mora na %s", joao.getNome(), joao.getEndereco());

	}

}
