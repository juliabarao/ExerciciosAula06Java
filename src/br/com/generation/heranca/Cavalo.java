package br.com.generation.heranca;

public class Cavalo extends Animal implements InterfaceAnimal{
	
	
	@Override
	public void somAnimal() {
		System.out.println("Som do Cavalo: iiirrrrí, rilinchin");
	}
	@Override
	public void correr() {
		System.out.println("Cavalo correndo...");
	}
	@Override
	public void subir() {
		
		
	}

}
