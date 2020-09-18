package POO;

public class Quadrado extends BaseFigura implements Figuras
	{
	Quadrado(double lado,String nome)
	{
	super(lado,lado,nome);
	nomeClasse = "Quadrado";
	// Argumentos para a superclasse
	}
	public double getDiagonal()
	{
	return Math.sqrt(2) * lado1;
	}
	} // Fim da classe Quadrado

