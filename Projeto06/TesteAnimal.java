package Projeto07;

public class TesteAnimal {
	public static void main(String args[]) {
		Cachorro bethoven = new Cachorro("Bethoven",90);
		Cavalo rocinante = new Cavalo("Rocinante",100);
		System.out.print(bethoven.getIdade());
		bethoven.correr();
		System.out.print(rocinante.som());
	}

}
