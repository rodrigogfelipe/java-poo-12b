package aula_12;

public class Reptil extends Animal {

	private String corEscama;

	/* Construtor padrao */
	public Reptil() {

	}

	/* GETTERS AND SETTERS */
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	/*Sobrepor metados da Superclasse Animal */
	@Override
	public void locomover() {
		System.out.println("Rastejando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");

	}

}
