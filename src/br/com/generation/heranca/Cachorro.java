package br.com.generation.heranca;

public class Cachorro extends Animal implements InterfaceAnimal{
	
	
	@Override
	public void somAnimal() {
		System.out.println("Som do Cachorro: Au au");
				
	}
	@Override
	public void correr() {
		System.out.println("Cachorro correndo...");
		
	}
	@Override
	public void subir() {
		
		
	}

}
