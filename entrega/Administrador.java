package entrega;

public class Administrador extends Pessoa {
	private double ajudaCusto;
	private double salario;
	private int numAjudantes;
	public Administrador(String nome, String endereco, String cpf, int telefone, int idad,
			double ajudaSalario, double salario, int numAjudantes)
	{
		super(nome, endereco, cpf, telefone, idad);
		this.ajudaCusto = ajudaSalario;
		this.numAjudantes = numAjudantes;
		this.salario = salario;
	}
	public void infoAdm() 
	{
		System.out.printf("Administrador %s possui:\n\t%d ajudante(s)\n\tSalario R$%.2f\n\tAjuda de custo R$%.2f\n", 
				nome, numAjudantes, salario, ajudaCusto);
	}
	public void salarioFinal()
	{
		double salarioFinal = salario + ajudaCusto;
		System.out.printf("Salário Final R$%.2f\n", salarioFinal);
	}
	public double getAjudaCusto() {
		return ajudaCusto;
	}
	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumAjudantes() {
		return numAjudantes;
	}
	public void setNumAjudantes(int numAjudantes) {
		this.numAjudantes = numAjudantes;
	}
}
