package br.com.generation.heranca;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		InterfaceAnimal cachorro = new Cachorro();
		Cachorro cac = new Cachorro();
		
		InterfaceAnimal cavalo = new Cavalo();
		Cavalo cav = new Cavalo();
		
		InterfaceAnimal preguica = new Preguica();
		Preguica preg = new Preguica();
				
		cac.setNome("Bahuan");
		cac.setIdade(13);
		cav.setNome("Spirit");
		cav.setIdade(3);
		preg.setNome("Lua");
		preg.setIdade(2);
		
		System.out.println("Nome: " + cav.getNome() + "     Idade: " + cav.getIdade() + " anos");
		cavalo.somAnimal();
		cavalo.correr();
		System.out.println();
		System.out.println("Nome: " + preg.getNome() + "     Idade: " + preg.getIdade() + " anos");
		preguica.somAnimal();
		preguica.subir();
		System.out.println();
		System.out.println("Nome: " + cac.getNome() + "     Idade: " + cac.getIdade() + " anos");
		cachorro.somAnimal();
		cachorro.correr();
		

	}

}
