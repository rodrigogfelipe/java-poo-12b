package aula_12;

public class Peixe extends Animal {

	private String corEscama;

	/* Construtor padrao */
	public Peixe() {

	}

	/* GETTERS AND SETTERS */
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	/* Declarando metado soltarBolha da propria Classe Peixe */
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	/*Sobrepor metados da Superclasse Animal */
	@Override
	public void locomover() {
		System.out.println("Nadando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");

	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");

	}

}
