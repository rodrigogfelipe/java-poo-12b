package aula_12;

public class Ave extends Animal {

	private String corPena;

	/* Construtor padrao */
	public Ave() {

	}

	/* GETTERS AND SETTERS */
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	/* Declarando metado da propria Classe Ave */
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	/* Sobrepor metados da Superclasse Animal */
	@Override
	public void locomover() {
		System.out.println("Voando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");

	}

}
