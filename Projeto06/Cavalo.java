package Projeto07;

public class Cavalo extends Animal {
	Cavalo (String nome, int idade) { super (nome, idade);}
	public String som() {
		return "hinn in in";
	}
	public void correr() {
		System.out.printf("Cavalo galopa");
	}
}
