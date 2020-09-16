package Projeto05;

public class Cliente {
	private String nomec;
	private String produtoc;
	private int qtd;
	private String informacao;
	public Cliente(String nome, String produto, int quantidade) 
	{
		nomec = nome;
		produtoc = produto;
		qtd = quantidade;
	}
	public String getInformacao() 
	{
		informacao = nomec + " comprou " + qtd + " " + produtoc + "(s)";
		return informacao;
	}
	public String getNomec() {
		return nomec;
	}
	public void setNomec(String nomec) {
		this.nomec = nomec;
	}
	public String getProdutoc() {
		return produtoc;
	}
	public void setProdutoc(String produtoc) {
		this.produtoc = produtoc;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
}
