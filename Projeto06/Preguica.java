package Projeto07;

public class Preguica extends Animal {
	Preguica (String nome, int idade){ super (nome, idade);}
	public String som() {
		return "ZZZZZZZZZZZZZ";
	}
	public void subir() {
		System.out.printf("Preguiça escala árvore");
	}
	
}
