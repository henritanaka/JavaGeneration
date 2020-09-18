package trabalho;

public class Pessoa {
	private String nome;
	private String CPF;
	private String hora;
	private int idade;
	
	public Pessoa(String nome, String CPF, String hora, int idade) {
		this.nome= nome;
		this.CPF= CPF;
		this.hora= hora;
		this.idade= idade;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}