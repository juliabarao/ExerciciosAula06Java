package br.com.generation.heranca;

public class ImprimeAnimal extends Animal{

	public static void main(String[] args) {
		
		testaAnimal ta = new testaAnimal();
		Animal cachorro = new Animal();
		Animal cavalo = new Animal();
		Animal preguica = new Animal();
		
		cachorro.setNome("Bahuan");
		cachorro.setIdade(13);
		cavalo.setNome("Spirit");
		cavalo.setIdade(3);
		preguica.setNome("Lua");
		preguica.setIdade(2);
		
		System.out.println("Nome: " + cavalo.getNome() + "     Idade: " + cavalo.getIdade() + " anos");
		ta.somAnimal(new Cavalo());
		ta.correr(new Cavalo());
		System.out.println();
		System.out.println("Nome: " + preguica.getNome() + "     Idade: " + preguica.getIdade() + " anos");
		ta.somAnimal(new Preguica());
		ta.subir(new Preguica());
		System.out.println();
		System.out.println("Nome: " + cachorro.getNome() + "     Idade: " + cachorro.getIdade() + " anos");
		ta.somAnimal(new Cachorro());
		ta.correr(new Cachorro());

	}

}
