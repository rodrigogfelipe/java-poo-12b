package aula_12;

public class Aula12 {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Canguru canguru = new Canguru();
		Goldfish goldfish = new Goldfish();

//		mamifero.setPeso(85.9f);
//		mamifero.setIdade(2);
//		mamifero.setMembros(4);
//		
//		mamifero.locomover();
//		mamifero.alimentar();
//		mamifero.emitirSom();

//		canguru.setPeso(85.9f);
//		canguru.setIdade(3);
//		canguru.setMembros(4);
//
//		canguru.locomover();
//		canguru.alimentar();
//		canguru.emitirSom();
//		canguru.usarBolsa();
//		System.out.println(canguru.toString());
		
		goldfish.setPeso(85.9f);
		goldfish.setIdade(3);
		goldfish.setMembros(4);

		goldfish.locomover();
		goldfish.alimentar();
		goldfish.emitirSom();
		goldfish.soltarBolha();
		
		System.out.println(goldfish.toString());


	}

}
