package entrega;

public class VendedorTeste {
	public static void main(String args[])
	{
		Vendedor alberto = new Vendedor ("Alberto", "Rua Getulio Vargas", "0964316", 
				119955989, 29, 100000.00, 10, 20000.00);
		System.out.printf("Vendedor %s de idade %d recebe ", alberto.getNome(), 
		alberto.getIdade());
		alberto.salarioFinal();
		
	}

}
