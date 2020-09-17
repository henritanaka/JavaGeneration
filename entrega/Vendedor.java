package entrega;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;
	private double salario;
    public Vendedor (String nome, String endereco, String cpf, int telefone, int idade, 
    		double valorVendas, double comissao, double salario)
    { 
    	super(nome, endereco, cpf, telefone, idade);
    	this.valorVendas = valorVendas;
    	this.comissao = comissao;
    	this.salario = salario;
    }
    
    public void salarioFinal() {
    	double salarioFinal = valorVendas * (comissao/100) + salario;
    	System.out.printf("Salário final de R$%.2f", salarioFinal);
    }
    
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    
    
    
    
    
}
