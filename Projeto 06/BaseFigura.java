package POO;

public class BaseFigura {
	
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	String getNomeClasse ()
	{
	return nomeClasse;
	}
	BaseFigura (double lado1,double lado2, String nome)
	{
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.nome = nome;
	}
	public double getArea()
	{ // Tem na interface
	return lado1 * lado2;
	}
	public double getPerimetro()
	{ // Tem na interface
	return (lado1 + lado2) * 2.0;
	}
	public String getNome()
	{ //Tem na interface
	return nome;
	}
	public void setNome (String nome)
	{// Tem na interface
	this.nome = nome;
	}
} // Fim de BaseFigura (superclasse)


