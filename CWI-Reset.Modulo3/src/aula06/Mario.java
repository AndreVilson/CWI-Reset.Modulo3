package aula06;

public class Mario {
	private String nome;
	private double altura;
	private int idade;
	private int estamina;
	private int qtdMoedas;
	private int qtdVidas;

	public Mario() {
		this.nome = "Mario Bros";
		this.altura = 1.5;
		this.idade = 40;
		this.estamina = 100;
		this.qtdMoedas = 0;
		this.qtdVidas = 1;
	}

	public Mario(String nome, int idade, double altura) {
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
		System.out.println("Super Força, Super Salto, Super Velocidade e Outros");
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

}
