package Projeto05;

public class Banco {
	private String conta;
	private String nome;
	private double saldo;
	public Banco(String conta, String nome, double saldo) 
	{
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
		
	}
	public double Saque(double qtd)
	{
		this.saldo -= qtd;
		return (double) saldo;
	}

}
