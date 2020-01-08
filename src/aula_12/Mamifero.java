package aula_12;

public class Mamifero extends Animal {

	private String corPelo;

	/* Construtor padrao */
	public Mamifero() {

	}

	/* GETTERS AND SETTERS */
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	/*Sobrepor metados da Superclasse Animal */
	@Override
	public void locomover() {
		System.out.println("Correndo");

	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");

	}

}
