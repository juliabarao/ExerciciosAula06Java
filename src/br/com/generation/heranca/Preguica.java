package br.com.generation.heranca;

public class Preguica extends Animal implements InterfaceAnimal{
	
	@Override
	public void somAnimal() {
		System.out.println("Som da Pregui�a: aaaahahh...qZzz");
	}
	@Override
	public void correr() {
	}
	@Override
	public void subir() {
		System.out.println("Pregui�a subindo...");
	}

}
