package aula07;

public class Personagem {
	private String nome;
	private double altura;
	private int idade;
	private int estamina;
	private int qtdMoedas;
	private int qtdVidas;

	public Personagem(String nome, int idade, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.estamina = 100;
		this.qtdMoedas = 0;
		this.qtdVidas = 1;
	}

	public void revigorar() {
		this.estamina = 100;
	}

	public void morrer() {
		this.qtdVidas--;
		this.estamina = 0;

		if (this.qtdVidas < 0) {
			qtdVidas = 0;
		} else {
			revigorar();
		}
	}

	public void coletarMoeda() {
		this.qtdMoedas++;

		if (this.qtdMoedas % 10 == 0) {
			this.qtdVidas++;
		}
	}

	public void imprimePoderes() {
		System.out.println("Super força, Super salto, super velocidade e outros.");
	}

	public void imprimeCaracteristicas() {
		System.out.println("nome: " + nome);
		System.out.println("altura: " + altura);
		System.out.println("Idade: " + idade);
		System.out.println("Estamina: " + estamina);
		System.out.println("Quantidade de Moedas: " + qtdMoedas);
		System.out.println("Quantidade de Vidas: " + qtdVidas);
	}

	public void perderEstamina() {
		this.estamina = this.estamina - 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}

	public void ganharEstamina() {
		this.estamina = this.estamina + 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}

	public void crescer() {
		this.altura = this.altura * 2;
	}

	public void saltar() {
		if (this.nome.equals("Mario"))
			System.out.println("Pulando uma altura de " + this.altura * 0.5);
		if (this.nome.equals("Luigi"))
			System.out.println("Pulando uma altura de " + +this.altura * 2);
	}
}
