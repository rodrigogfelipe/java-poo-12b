package aula_12;

public class Canguru extends Mamifero {

	/* Construtor padrao */
	public Canguru() {

	}

	/* Declarando metado da propria Classe Canguru */
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}

	/* Sobrepor metados da Superclasse Mamifero */
	@Override
	public void locomover() {
		System.out.println("Saltando");

	}

}
