package Projeto07;

public class Cachorro extends Animal {
	Cachorro(String nome, int idade){ super(nome, idade); }
	public void correr() {
		System.out.printf("Cachorro corre\n");
	}
	public String som() {
		return "AuAuAu";
	}

}
